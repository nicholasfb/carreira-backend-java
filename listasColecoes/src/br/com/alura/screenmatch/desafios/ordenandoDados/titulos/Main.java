package br.com.alura.screenmatch.desafios.ordenandoDados.titulos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Titulo t1 = new Titulo("A Substância");
        Titulo t2 = new Titulo("Matrix");
        Titulo t3 = new Titulo("Cinderella");
        Titulo t4 = new Titulo("Bastardos Inglórios");

        List<Titulo> listaFilmes = new ArrayList<>();
        //ArrayList<Titulo> listaFilmes = new ArrayList<>();
        //List<Titulo> listaFilmes = new LinkedList<>();

        listaFilmes.add(t1);
        listaFilmes.add(t2);
        listaFilmes.add(t3);
        listaFilmes.add(t4);

        Collections.sort(listaFilmes);

        for (Titulo filme : listaFilmes) {
            System.out.println(filme);
        }
    }
}
