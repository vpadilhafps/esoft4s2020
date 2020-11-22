package vinicius_padilha;

import javax.persistence.Entity;

@Entity
public class Tecnico extends Equipe {
    private String tecnicoDoTime;

    public Tecnico() {
        super();
    }

    public String getTecnicoDoTime() {
        return tecnicoDoTime;
    }

    public void setTecnicoDoTime(String tecnicoDoTime) {
        this.tecnicoDoTime = tecnicoDoTime;
    }

}
