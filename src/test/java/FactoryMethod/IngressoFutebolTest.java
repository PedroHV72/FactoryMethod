package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IngressoFutebolTest {

    @Test
    void deveExecutarFutebol() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Futebol");
        assertEquals("Ingresso futebol validado", ingresso.executar());
    }

    @Test
    void deveCancelarFutebol() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Futebol");
        assertEquals("Jogo cancelado", ingresso.cancelar());
    }

}
