package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IngressoFutsalTest {

    @Test
    void deveExecutarFutsal() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Futsal");
        assertEquals("Ingresso futsal validado", ingresso.executar());
    }

    @Test
    void deveCancelarFutsal() {
        IIngresso ingresso = IngressoFactory.obterIngresso("Futsal");
        assertEquals("Jogo cancelado", ingresso.cancelar());
    }

}
