package Poo;

public class Aluno extends Pessoa {
        private String marca;
        private int ano;
        public Aluno(String marca, int ano) {
            this.marca = marca;
            this.ano = ano;
        }
        public void ligar() {
            System.out.println(marca + " ligado!");
        }
    }


