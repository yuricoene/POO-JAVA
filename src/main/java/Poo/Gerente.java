package Poo;

    public class Cachorro extends Funcionario {
    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + ": Au au!");
    }
}

