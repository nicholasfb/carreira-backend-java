package br.com.alura.screenmatch.desafioModuloMeu.principal;

import br.com.alura.screenmatch.desafioModuloMeu.modelo.Compra;
import br.com.alura.screenmatch.desafioModuloMeu.modelo.Produto;

import java.util.Scanner;

public class Menu {
   private Scanner rd = new Scanner(System.in);
   private Compra compras = new Compra();

   public void solicitaLimiteCartao(){
       System.out.println("Digite o limite do cartão: ");
       Double limiteCartao = rd.nextDouble();
       rd.nextLine();
       compras.setLimiteCartao(limiteCartao);
   }

    public boolean realizaCompra(){
        System.out.println("Digite a descrição da compra: ");
        String nomeProduto = rd.nextLine();

        System.out.println("Digite o valor da compra");
        Double precoProduto = rd.nextDouble();
        rd.nextLine();

        Produto produto = new Produto(nomeProduto, precoProduto);

        return compras.adicionaProduto(produto);
    }

    public void finalizaMenu(){
       compras.exibeCompras();
    }


}
