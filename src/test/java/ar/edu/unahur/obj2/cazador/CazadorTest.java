package ar.edu.unahur.obj2.cazador;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.cazadores.CazadorSigiloso;
import ar.edu.unahur.obj2.cazadores.CazadorUrbano;
import ar.edu.unahur.obj2.cazadores.CazadorRural;
import ar.edu.unahur.obj2.profugo.Profugo;

public class CazadorTest {
    @Test
    void urbanoCapturaSiLaExperienciaEsMayorYNoNervioso() {
        CazadorUrbano c = new CazadorUrbano(60);
        Profugo p = new Profugo(40, 70, false);
        assertTrue(c.puedeCapturar(p));
    }

    @Test
    void ruralNoCapturaSiNoEsNervioso() {
        CazadorRural c = new CazadorRural(70);
        Profugo p = new Profugo(30, 60, false);
        assertFalse(c.puedeCapturar(p));
    }

    @Test
    void sigilosoNoCapturaSiHabilidadAlta() {
        CazadorSigiloso c = new CazadorSigiloso(80);
        Profugo p = new Profugo(20, 90, true);
        assertFalse(c.puedeCapturar(p));
    }
}
