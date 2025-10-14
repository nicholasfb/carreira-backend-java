package br.com.alura.screenmatch.desafio.modelo;

public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Meow!!");
    }

    public void arranharMoveis(){
        System.out.println("Scratch");
    }
}
