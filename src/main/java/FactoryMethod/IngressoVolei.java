package FactoryMethod;

public class IngressoVolei implements IIngresso{
    public String executar() {
        return "Ingresso vôlei validado";
    }

    public String cancelar() {
        return "Jogo cancelado";
    }
}
