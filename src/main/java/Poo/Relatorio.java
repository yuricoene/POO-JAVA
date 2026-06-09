package Poo;

public class ContaCorrente extends Imprimivel {
    @Override
    public void sacar(double valor) {
        saldo -= valor; // permite negativo
    }
}
