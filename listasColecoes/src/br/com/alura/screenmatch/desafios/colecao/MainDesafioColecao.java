package br.com.alura.screenmatch.desafios.colecao;

import br.com.alura.screenmatch.desafios.colecao.modelo.Pessoa;

import java.util.ArrayList;

public class MainDesafioColecao {
    public static void main(String[] args) {

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa();
        p1.setNome("Ayrke");
        p1.setIdade(27);

        Pessoa p2 = new Pessoa();
        p2.setNome("Puck");
        p2.setIdade(24);

        Pessoa p3 = new Pessoa();
        p3.setNome("Nicholas");
        p3.setIdade(27);

        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);

        System.out.println("Tamanho da lista: " + listaPessoas.size());

        System.out.println("Primeira Pessoa da lista: " + listaPessoas.get(0).toString());

        System.out.println("\nLista Completa:");
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
    }


}
