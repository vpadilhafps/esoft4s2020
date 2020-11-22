package vinicius_padilha;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import java.util.List;

@Entity
public class Jogo {
    public String nomeDoTimeDoJogo;
    public String descricaoDoJogo;
    @ManyToMany
    private List<Estadio> Estadio = new ArrayList<>();

    public Jogo(String nomeDoTimeDoJogo, String descricaoDoJogo) {
        this.nomeDoTimeDoJogo = nomeDoTimeDoJogo;
        this.descricaoDoJogo = descricaoDoJogo;
    }

    public void addEstadio(Estadio novo) {
        this.Estadio.add(novo);
    }

    @Override
    public String toString() {
        return "Nome do Estadio: " + this.Estadio;
    }

}
