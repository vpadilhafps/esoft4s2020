package vinicius_padilha;

import javax.persistence.Entity;

@Entity
public class Jogador extends Equipe {
    private String posicaoJogador;

    public Jogador() {
        super();
    }

    public String getPosicaoJogador() {
        return posicaoJogador;
    }

    public void setPosicaoJogador(String posicaoJogador) {
        this.posicaoJogador = posicaoJogador;
    }

}