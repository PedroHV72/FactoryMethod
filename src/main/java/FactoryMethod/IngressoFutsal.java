package FactoryMethod;

public class IngressoFutsal implements IIngresso{
    public String executar() {
        return "Ingresso futsal validado";
    }

    public String cancelar() {
        return "Jogo cancelado";
    }
}
