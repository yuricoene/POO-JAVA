package Poo;

public class Main {
    List animais = new ArrayList<>();

    animais.add(new Cachorro("Rex"));
    animais.add(new Gato("Mimi"));
    animais.add(new Cachorro("Thor"));
    animais.add(new Gato("Luna"));
    for (Animal a : animais) {
        a.emitirSom();
    }
}

