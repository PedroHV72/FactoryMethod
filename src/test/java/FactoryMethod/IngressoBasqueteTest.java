package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IngressoBasqueteTest {

    @Test
    void deveExecutarBasquete() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Basquete");
        assertEquals("Ingresso basquete validado", ingresso.executar());
    }

    @Test
    void deveCancelarBasquete() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Basquete");
        assertEquals("Jogo cancelado", ingresso.cancelar());
    }

}
