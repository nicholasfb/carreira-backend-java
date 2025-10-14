package br.com.alura.screenmatch.desafioModuloMeu.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        Menu menu = new Menu();
        Boolean escolha = true;


        Integer opcao = 1;
        menu.solicitaLimiteCartao();
        while(escolha) {
            if (opcao == 1) {
                if(menu.realizaCompra()){
                    System.out.println("Digite 0 para sair ou 1 para continuar: ");
                    opcao = rd.nextInt();
                    rd.nextLine();
                } else {
                    opcao = 0;
                }
            } else if (opcao == 0) {
                menu.finalizaMenu();
                break;
            } else {
                System.out.println("Digite uma opção válida");
                System.out.println("Digite 0 para sair ou 1 para continuar: ");
                opcao = rd.nextInt();
                rd.nextLine();
            }

        }

    }
}
