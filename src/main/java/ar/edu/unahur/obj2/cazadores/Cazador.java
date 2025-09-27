package ar.edu.unahur.obj2.cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.profugo.Profugo;

public abstract class Cazador {

    private Integer experiencia;
    private List<Profugo> profugosCapturados = new ArrayList<Profugo>();


    public Cazador(Integer experiencia) {
        this.experiencia = experiencia;
    }

    //Condición general
    public Boolean puedeCapturar(Profugo p) {
        return this.experiencia > p.getInocencia() && this.condicionEspecifica(p);
    }

    //Condición específica
    protected abstract Boolean condicionEspecifica(Profugo p);


    public void intimidar(Profugo p) {
        p.disminuirInocencia();
        this.intimidacionEspecifica(p);
    }

    protected abstract void intimidacionEspecifica(Profugo p);


}