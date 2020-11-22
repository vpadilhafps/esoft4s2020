package vinicius_padilha;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Equipe {
    private String nomeEquipe;
    private String acronimoEquipe;
    @OneToOne(mappedBy = "endereco")
    private Endereco endereco;

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public String getAcronimoEquipe() {
        return acronimoEquipe;
    }

    public void setNomeEquipe(String nomeEquipe) {
        this.nomeEquipe = nomeEquipe;
    }

    public void setAcronimoEquipe(String acronimoEquipe) {
        this.acronimoEquipe = acronimoEquipe;
    }

}
