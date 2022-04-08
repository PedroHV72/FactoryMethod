package FactoryMethod;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.fail;

public class IngressoFactoryTest {

    @Test
    void deveRetornarExcecaoParaIngressoInexistente() {
        try {
            IIngresso ingresso = IngressoFactory.obterIngresso("Retirado");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ingresso inexistente", e.getMessage());
        }
    }
}
