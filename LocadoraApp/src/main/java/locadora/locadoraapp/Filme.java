/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.locadoraapp;

/**
 *
 * @author rodrigo
 */
public class Filme {

    private int codigo, ano;
    private String nome, generoFilme1, generoFilme2, mediaNotas;

    @Override
    public String toString() {
        if (generoFilme2==null) {
            return "Nome: " + this.nome + " | Lançamento: " + this.ano + " | Gênero: " + this.generoFilme1 + " | Média de avaliações: " + this.mediaNotas;
        } else {
            return "Nome: " + this.nome + " | Lançamento: " + this.ano + " | Gêneros: " +this.generoFilme1 +", "+ this.generoFilme2 + " | Média de avaliações: " + this.mediaNotas;
        }

    }

    public Filme(int codigo) {
        this.codigo = codigo;
    }

    public Filme(int codigo, String nome, int ano, String generoFilme1, String generoFilme2, String mediaNotas) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.generoFilme1 = generoFilme1;
        this.generoFilme2 = generoFilme2;
        this.mediaNotas = mediaNotas;
    }

    public Filme(String nome, int ano, String generoFilme1, String generoFilme2) {
        this.nome = nome;
        this.ano = ano;
        this.generoFilme1 = generoFilme1;
        this.generoFilme2 = generoFilme2;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGeneroFilme1() {
        return generoFilme1;
    }

    public void setGeneroFilme1(String generoFilme1) {
        this.generoFilme1 = generoFilme1;
    }

    public String getGeneroFilme2() {
        return generoFilme2;
    }

    public void setGeneroFilme2(String generoFilme2) {
        this.generoFilme2 = generoFilme2;
    }

    public String getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(String mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

}
