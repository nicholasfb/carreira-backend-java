package br.com.alura.screenmatch.desafios.conta.principal;

import br.com.alura.screenmatch.desafios.conta.modelo.ContaBancaria;

import java.util.ArrayList;

public class MainConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(169.0);
        ContaBancaria conta2 = new ContaBancaria(450.0);
        ContaBancaria conta3 = new ContaBancaria(124.0);
        ContaBancaria conta4 = new ContaBancaria(920.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("A conta que tem o maior saldo é a " + contaMaiorSaldo);
    }
}
