/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.locadoraapp;

/**
 *
 * @author rodrigo
 */
public class Usuario {

    private String nome;
    private String generoUsuario;
    private int idade;
    private String email;
    private String senha;
    private String generoFilmeFavorito;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String nome, String generoUsuario, int idade, String email, String senha, String generoFilmeFavorito) {
        this.nome = nome;
        this.generoUsuario = generoUsuario;
        this.idade = idade;
        this.email = email;
        this.senha = senha;
        this.generoFilmeFavorito = generoFilmeFavorito;
    }

    
    public Usuario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGeneroUsuario() {
        return generoUsuario;
    }

    public void setGeneroUsuario(String generoUsuario) {
        this.generoUsuario = generoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String nome) {
        this.email = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGeneroFilmeFavorito() {
        return generoFilmeFavorito;
    }

    public void setGeneroFilmeFavorito(String generoFilmeFavorito) {
        this.generoFilmeFavorito = generoFilmeFavorito;
    }

}
