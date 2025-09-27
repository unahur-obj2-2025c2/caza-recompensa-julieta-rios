package ar.edu.unahur.obj2.profugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProfugoTest {
    @Test
    public void guardaYDevuelveAtributos(){
        Profugo p = new Profugo(60, 70, Boolean.TRUE);
        assertEquals(Integer.valueOf(60), p.getInocencia());
        assertEquals(Integer.valueOf(70), p.getHabilidad());
        assertTrue(p.esNervioso());
    }

    @Test
    public void disminuirInocenciaNoBajaDeCero(){
        Profugo p = new Profugo(1, 10, Boolean.FALSE);

        p.disminuirInocencia();
        p.disminuirInocencia();
        
        assertEquals(Integer.valueOf(0), p.getInocencia());
    }

    @Test
    public void reducirHabilidadNoBajaDeCero(){
        Profugo p = new Profugo(10, 3, Boolean.TRUE);

        p.reducirHabilidad();
        p.reducirHabilidad();
        
        assertEquals(Integer.valueOf(0), p.getHabilidad());
    }
}
