package Poo;

public class Carro {
    public class Carro extends Veiculo {
        private int numPortas;
        public Carro(String marca, int ano, int numPortas) {
            super(marca, ano);
            this.numPortas = numPortas;
        }
    }
}
