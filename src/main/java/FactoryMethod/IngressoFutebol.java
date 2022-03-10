package FactoryMethod;

public class IngressoFutebol implements IIngresso {
    public String executar() {
        return "Ingresso futebol validado";
    }

    public String cancelar() {
        return "Jogo cancelado";
    }
}
