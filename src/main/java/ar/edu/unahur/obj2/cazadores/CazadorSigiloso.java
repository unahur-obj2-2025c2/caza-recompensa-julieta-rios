package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorSigiloso extends Cazador{

    public CazadorSigiloso(Integer experiencia) {
        super(experiencia);
    }


    @Override
    protected Boolean condicionEspecifica(Profugo p) {
        return p.getHabilidad() < 50;
    }

    @Override
    protected void intimidacionEspecifica(Profugo p) {
        p.reducirHabilidad();
    }
}
