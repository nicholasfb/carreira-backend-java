package br.com.alura.screenmatch.desafios.listasObjetosDistintos.principal;

import br.com.alura.screenmatch.desafios.listasObjetosDistintos.modelo.Produto;

import java.util.ArrayList;

public class MainProduto {
    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<>();

        Produto p1 = new Produto("Queijo", 13.0);
        Produto p2 = new Produto("Presunto", 16.0);
        Produto p3 = new Produto("Requeijão", 8.0);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        double[] soma = {0};
        lista.forEach(p -> soma[0] += p.getPreco());

        double media = soma[0] / lista.size();

        System.out.println("Soma acumulada: " + soma[0]);
        System.out.printf("Média: %.2f%n", media);
    }
}
