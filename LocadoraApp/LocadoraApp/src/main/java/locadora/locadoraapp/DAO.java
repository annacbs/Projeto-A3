/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.locadoraapp;

/**
 *
 * @author rodrigo
 */
import java.sql.*;
public class DAO {
    
    public void remover (Filme filme) throws Exception{
        String sql = "DELETE FROM tb_filmes WHERE cod_filme = ?";
        try(
            var conexao = ConexaoBD.obterConexao();
            var ps = conexao.prepareStatement(sql);
        ){
            ps.setInt(1, filme.getCodigo());
            ps.execute();
        }
    }
    
    
    public void cadastrarFilme(Filme filme) throws Exception{
        String sql = "INSERT INTO tb_filmes (nome,ano,genero_filme,nota) VALUES (?,?,?,?)";
        try(
            var conexao = ConexaoBD.obterConexao();
            var ps = conexao.prepareStatement(sql);
        ){
            ps.setString(1, filme.getNome());
            ps.setInt(2, filme.getAno());
            ps.setString(3, filme.getGeneroFilme());
            ps.setInt(4, filme.getNota());
            
            ps.execute();
        }
    }
     public void cadastrarUsuario(Usuario usuario) throws Exception{
        String sql = "INSERT INTO tb_usuario (nome,genero_usuario,idade,email,senha,genero_filme_favorito) VALUES (?,?,?,?,?,?)";
        try(
            var conexao = ConexaoBD.obterConexao();
            var ps = conexao.prepareStatement(sql);
        ){
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getGeneroUsuario());
            ps.setInt(3, usuario.getIdade());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getSenha());
            ps.setString(6, usuario.getGeneroFilmeFavorito());
            
            ps.execute();
        }
    }
    
    public boolean existe (Usuario usuario) throws Exception{
        //1. Especificar o comando SQL
        String sql = "SELECT nome, senha FROM tb_usuario WHERE email = ? AND senha = ?";
        //2. Abrir uma conexão com o banco
        //try-with-resources
        //3. Preparar o comando
        try(
            Connection conexao = ConexaoBD.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
        ){
            //4. Substituir os eventuais placeholders
            ps.setString(1, usuario.getEmail());
            ps.setString(2, usuario.getSenha());
            //5. Executar o comando
            try(
                ResultSet rs = ps.executeQuery();
            ){
                //6. Manipular os dados obtidos
                return rs.next();
            }
            //7. Fechar os recursos (já foi feito pelo try-with-resources)
        }
    }
}
