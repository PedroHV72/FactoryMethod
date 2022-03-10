package FactoryMethod;

public class IngressoBasquete implements IIngresso{
    public String executar() {
        return "Ingresso basquete validado";
    }

    public String cancelar() {
        return "Jogo cancelado";
    }
}
