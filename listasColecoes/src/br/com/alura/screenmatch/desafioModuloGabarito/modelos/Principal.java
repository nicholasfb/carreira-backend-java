package br.com.alura.screenmatch.desafioModuloGabarito.modelos;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.println("Digite o limite do cartão");
        double limite = rd.nextDouble();
        rd.nextLine();

        CartaoCredito cartao = new CartaoCredito(limite);

        int sair = 1;

        while(sair != 0) {
            System.out.println("Digite a descrição da compra:");
            String descricao = rd.nextLine();

            System.out.println("Digite o valor da compra");
            double valor = rd.nextDouble();

            Compra compra = new Compra(descricao, valor);
            boolean compraRealizada = cartao.lancaCompras(compra);


            if (compraRealizada) {
                System.out.println("Compra Realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = rd.nextInt();
                rd.nextLine();
            } else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
        }

        System.out.println("******************************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(cartao.getCompras());
        for (Compra compra : cartao.getCompras()) {
            System.out.println(compra.getDescricao() + " - R$" + compra.getValor());
        }
        System.out.println("******************************");
        System.out.println("\nSaldo do cartão: " + cartao.getSaldo());

    }
}
