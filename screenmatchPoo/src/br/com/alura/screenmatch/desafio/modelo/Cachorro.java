package br.com.alura.screenmatch.desafio.modelo;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("AU! AU! AU! AU!");
    }

    public void abanarRabo(){
        System.out.println("Abanando Rabo!");
    }
}
