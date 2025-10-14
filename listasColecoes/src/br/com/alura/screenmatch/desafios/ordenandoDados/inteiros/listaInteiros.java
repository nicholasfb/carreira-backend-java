package br.com.alura.screenmatch.desafios.ordenandoDados.inteiros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listaInteiros {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(192);
        listaInteiros.add(254);
        listaInteiros.add(100);
        listaInteiros.add(25);
        listaInteiros.add(332);
        listaInteiros.add(442);

        System.out.println(listaInteiros);

        Collections.sort(listaInteiros);
        System.out.println("Lista Ordenada:");
        System.out.println(listaInteiros);
    }
}
