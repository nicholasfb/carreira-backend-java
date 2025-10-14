package br.com.alura.screenmatch.desafios.construtores;

import br.com.alura.screenmatch.desafios.construtores.modelo.Produto;
import br.com.alura.screenmatch.desafios.construtores.modelo.ProdutoPericivel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainConstrutores {
    public static void main(String[] args) {

        List<Produto> listaProdutos = new ArrayList<>();

        Produto p1 = new Produto("Queijo Gorgonzola", 13.0, 5);
        Produto p2 = new Produto("Presunto Defumado", 17.0, 10);
        Produto p3 = new Produto("Pipoca Premium", 12.0, 15);

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);

        for (Produto produto : listaProdutos) {
            System.out.println(produto.toString());
        }

        ProdutoPericivel pp1 = new ProdutoPericivel("Danone de Morango", 5.0, 12, LocalDate.now());
        ProdutoPericivel pp2 = new ProdutoPericivel("Cream Cheese", 20.0, 3, LocalDate.now().plusDays(20));

        listaProdutos.add(pp1);
        listaProdutos.add(pp2);


        for (Produto produto : listaProdutos) {
            System.out.println(produto.toString());
        }

    }
}
