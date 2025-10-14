package br.com.alura.desafio;

import br.com.alura.desafio.modelo.Aluno;
import br.com.alura.desafio.modelo.Livro;
import br.com.alura.desafio.modelo.Produto;

public class MainDesafio {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Vinho do porto");
        produto.setPreco(100.0);
        produto.aplicaDesconto(10);
        System.out.println(produto.getPreco());

        System.out.println("\nCalcula Média notas do Aluno");

        Aluno aluno = new Aluno();

        aluno.setNome("Gerson");
        aluno.setNotas(new double[]{7.5, 8.0, 9.2, 6.8, 10.0});

        double media = aluno.calculaMedia(aluno.getNotas());
        System.out.println(media);

        System.out.println("\nExibe Detalhes do Livro");
        Livro livro = new Livro();

        livro.setTitulo("O Velho e o Mar");
        livro.setAutor("Ernest Hemingway");
        livro.exibeDetalhes();
    }
}
