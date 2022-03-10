package FactoryMethod;

public class IngressoFactory {

    public static IIngresso obterIngresso(String ingresso) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("FactoryMethod.Ingresso" + ingresso);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ingresso inexistente");
        }
        if (!(objeto instanceof IIngresso)) {
            throw new IllegalArgumentException("Ingresso inválido");
        }
        return (IIngresso) objeto;
    }
}
