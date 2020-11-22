package vinicius_padilha;

import javax.persistence.Entity;

@Entity
public class Estadio {
    private String nomeDoEstadio;
    private int numeroDoEstadio;

    public String getNomeDoEstadio() {
        return nomeDoEstadio;
    }

    public int getNumeroDoEstadio() {
        return numeroDoEstadio;
    }

    public void setNomeDoEstadio(String nomeDoEstadio) {
        this.nomeDoEstadio = nomeDoEstadio;
    }

    public void setNumeroDoEstadio(int numeroDoEstadio) {
        this.numeroDoEstadio = numeroDoEstadio;
    }

    public Estadio(String nomeDoEstadio, int numeroDoEstadio) {
        this.nomeDoEstadio = nomeDoEstadio;
        this.numeroDoEstadio = numeroDoEstadio;
    }

    public static void add(Estadio Estadio1) {

    }

}
