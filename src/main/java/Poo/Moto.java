package Poo;

public class Gerente extends Veiculo {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public double calcularBonus() { return getSalario() * 0.20; }
}



