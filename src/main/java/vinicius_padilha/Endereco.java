package vinicius_padilha;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Endereco {
    private String bairro;
    private String logradouro;
    private int numero;
    @OneToOne
    @JoinColumn(name = "Endereco")
    private Equipe Equipe;

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
