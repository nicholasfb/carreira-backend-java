package br.com.alura.screenmatch.desafios.listasObjetosDistintos.principal;

import br.com.alura.screenmatch.desafios.listasObjetosDistintos.modelo.Animal;
import br.com.alura.screenmatch.desafios.listasObjetosDistintos.modelo.Cachorro;

import java.util.ArrayList;

public class MainAnimalCachorro {
    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<>();

        Animal animal = new Animal("Primata","Dourado","Masculino", "Mamífero");

        Cachorro cachorro1 = new Cachorro("Preto", "Masculino", "Mamíferos",
                "Canino", "Puck", "Lulu da Pomerania", 2);
        Cachorro cachorro2 = new Cachorro("Caramelo", "Masculino", "Mamíferos",
                "Canino", "Rex", "Vira Latas", 1);

        lista.add(cachorro1);
        lista.add(cachorro2);
        lista.add(animal);
    }


}
