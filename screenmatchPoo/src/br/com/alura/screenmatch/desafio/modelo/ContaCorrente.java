package br.com.alura.screenmatch.desafio.modelo;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal(){
        if (saldo < 10) {
            System.out.println("Valor insuficiente para pagar Tarifa Mensal");
        } else {
            saldo -= 10;
            System.out.println("Tarifa Mensal de R$10 paga com sucesso!");
        }
    }
}
