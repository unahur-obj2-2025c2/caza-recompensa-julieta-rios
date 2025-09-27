package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorRural extends Cazador{

    public CazadorRural(Integer experiencia) {
        super(experiencia);
    }

    @Override
    protected Boolean condicionEspecifica(Profugo p) {
        return p.esNervioso();
    }
    
    @Override
    protected void intimidacionEspecifica(Profugo p){
        p.volverseNervioso();
    }
}
