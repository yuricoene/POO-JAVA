package Poo;

public class ContaCorrente extends Conta {
    @Override
    public void sacar(double valor) {
        saldo -= valor; // permite negativo
    }
}
