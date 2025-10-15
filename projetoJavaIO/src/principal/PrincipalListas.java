package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Her", 2013);
        filme1.avalia(10);

        Filme filme2 = new Filme("Matrix", 1997);
        filme2.avalia(9);

        Filme filme3 = new Filme("Sweeney Todd", 2008);
        filme3.avalia(8);

        Serie serie1 = new Serie("The Big Bang Theory", 2008);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(serie1);
        lista.add(filme3);
        lista.add(filme2);
        lista.add(filme1);



        lista.forEach(System.out::println);

        for(Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscarPorArtista = new ArrayList<>();

        buscarPorArtista.add("Matheus Puck");
        buscarPorArtista.add("Juninho Xucreza");
        buscarPorArtista.add("Ayrke Braga");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        //lista.sort(Comparator.comparing(Titulo::getNome).reversed());
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano crescente");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento).reversed());
        System.out.println("Ordenado por ano decrescente");
        System.out.println(lista);
    }
}
