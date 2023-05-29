/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locadora.locadoraapp;

/**
 *
 * @author Gabriel
 */
public class AvaliacaoFilme {
    private int codigoAvaliacao,codigoFilme,nota;

    public AvaliacaoFilme(int nota) {
        this.nota = nota;
    }

    public AvaliacaoFilme(int codigoFilme, int nota) {
        this.codigoFilme = codigoFilme;
        this.nota = nota;
    }

    public int getCodigoAvaliacao() {
        return codigoAvaliacao;
    }

    public void setCodigoAvaliacao(int codigoAvaliacao) {
        this.codigoAvaliacao = codigoAvaliacao;
    }

    public int getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
