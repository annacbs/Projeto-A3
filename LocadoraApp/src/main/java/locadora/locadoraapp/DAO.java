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

    public void remover(Filme filme) throws Exception {
        String sql = "DELETE FROM tb_filmes WHERE cod_filme = ?";
        try (
                 var conexao = ConexaoBD.obterConexao();  var ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, filme.getCodigo());
            ps.execute();
        }
    }

    public void cadastrarFilme(Filme filme) throws Exception {
        String sql = "INSERT INTO tb_filmes (nome,ano,genero_filme1,genero_filme2) VALUES (?,?,?,?)";
        try (
                 var conexao = ConexaoBD.obterConexao();  var ps = conexao.prepareStatement(sql);) {
            ps.setString(1, filme.getNome());
            ps.setInt(2, filme.getAno());
            ps.setString(3, filme.getGeneroFilme1());
            ps.setString(4, filme.getGeneroFilme2());

            ps.execute();
        }
    }

    public void avaliarFilme(AvaliacaoFilme avaliacaoFilme) throws Exception {
        String sql = "insert into tb_avaliacao_filmes (nota) value ((select cod_filme from tb_filmes where cod_filme = ?),?);";
        try (
                 var conexao = ConexaoBD.obterConexao();  var ps = conexao.prepareStatement(sql);) {
            ps.setInt(1, avaliacaoFilme.getCodigoFilme());
            ps.setInt(2, avaliacaoFilme.getNota());

            ps.execute();
        }
    }

    public void cadastrarUsuario(Usuario usuario) throws Exception {
        String sql = "INSERT INTO tb_usuario (nome,genero_usuario,idade,email,senha,genero_filme_favorito1,genero_filme_favorito2) VALUES (?,?,?,?,?,?,?)";
        try (
                 var conexao = ConexaoBD.obterConexao();  var ps = conexao.prepareStatement(sql);) {
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getGeneroUsuario());
            ps.setInt(3, usuario.getIdade());
            ps.setString(4, usuario.getEmail());
            ps.setString(5, usuario.getSenha());
            ps.setString(6, usuario.getGeneroFilmeFavorito1());
            ps.setString(7, usuario.getGeneroFilmeFavorito2());

            ps.execute();
        }
    }

    public boolean existe(Usuario usuario) throws Exception {
        //1. Especificar o comando SQL
        String sql = "SELECT email, senha FROM tb_usuario WHERE email = ? AND senha = ?";
        //2. Abrir uma conexão com o banco
        //try-with-resources
        //3. Preparar o comando
        try (
                Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql);) {
            //4. Substituir os eventuais placeholders
            ps.setString(1, usuario.getEmail());
            ps.setString(2, usuario.getSenha());
            //5. Executar o comando
            try (
                    ResultSet rs = ps.executeQuery();) {
                //6. Manipular os dados obtidos
                return rs.next();
            }
            //7. Fechar os recursos (já foi feito pelo try-with-resources)
        }
    }

    public boolean existe(Adm adm) throws Exception {
        //1. Especificar o comando SQL
        String sql = "SELECT login, senha FROM tb_adm WHERE login = ? AND senha = ?";
        //2. Abrir uma conexão com o banco
        //try-with-resources
        //3. Preparar o comando
        try (
                Connection conexao = ConexaoBD.obterConexao(); PreparedStatement ps = conexao.prepareStatement(sql);) {
            //4. Substituir os eventuais placeholders
            ps.setString(1, adm.getLogin());
            ps.setString(2, adm.getSenha());
            //5. Executar o comando
            try (
                    ResultSet rs = ps.executeQuery();) {
                //6. Manipular os dados obtidos
                return rs.next();
            }
            //7. Fechar os recursos (já foi feito pelo try-with-resources)
        }
    }

    public Filme[] obterFilmes() throws Exception {
        String sql = "SELECT f.cod_filme, f.nome, f.ano, f.genero_filme1, f.genero_filme2,CAST(AVG(av.nota)AS DECIMAL(3,1)) AS media_notas FROM tb_filmes f INNER JOIN tb_avaliacao_filmes av ON av.cod_filme = f.cod_filme GROUP BY f.cod_filme, f.nome, f.ano, f.genero_filme1, f.genero_filme2 ORDER BY media_notas DESC;";
        try (Connection conn = ConexaoBD.obterConexao(); PreparedStatement ps
                = conn.prepareStatement(sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_READ_ONLY); ResultSet rs = ps.executeQuery()) {
            int totalDeFilmes = rs.last() ? rs.getRow() : 0;
            Filme[] filmes = new Filme[totalDeFilmes];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int codigo = rs.getInt("cod_filme");
                String nome = rs.getString("nome");
                int ano = rs.getInt("ano");
                String generoFilme1 = rs.getString("genero_filme1");
                String generoFilme2 = rs.getString("genero_filme2");
                String mediaNotas = rs.getString("media_notas");

                filmes[contador++] = new Filme(codigo, nome, ano, generoFilme1, generoFilme2, mediaNotas);
            }
            return filmes;
        }
    }
}
