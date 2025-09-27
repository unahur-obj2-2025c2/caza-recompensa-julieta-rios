package ar.edu.unahur.obj2.cazadores;

import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorUrbano extends Cazador{

    public CazadorUrbano(Integer experiencia) {
        super(experiencia);
    }


    @Override
    protected Boolean condicionEspecifica(Profugo p) {
        return !p.esNervioso();
    }

    @Override
    protected void intimidacionEspecifica(Profugo p) {
        p.dejarDeSerNervioso();
    }

}
