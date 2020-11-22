package vinicius_padilha;

import javax.persistence.Entity;

@Entity
public class Arbitro extends Equipe {
    private String posicaoArbitro;

    public Arbitro() {
        super();
    }

    public String getPosicaoArbitro() {
        return posicaoArbitro;
    }

    public void setPosicaoArbitro(String posicaoArbitro) {
        this.posicaoArbitro = posicaoArbitro;
    }
}
