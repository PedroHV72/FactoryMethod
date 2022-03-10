package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IngressoVoleiTest {

    @Test
    void deveExecutarVolei() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Volei");
        assertEquals("Ingresso vôlei validado", ingresso.executar());
    }

    @Test
    void deveCancelarVolei() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Volei");
        assertEquals("Jogo cancelado", ingresso.cancelar());
    }

}
