package Poo;

public class ContaPoupanca extends Imprimivel {
    @Override
    public void sacar(double valor) {
        if (valor <= saldo) saldo -= valor;
        else System.out.println("Saldo insuficiente!");
    }
}


