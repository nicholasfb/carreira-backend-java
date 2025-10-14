package br.com.alura.screenmatch.desafios.conta.modelo;

public class ContaBancaria {
    private Integer numeroConta;
    private Double saldo;
    private static Integer incremento = 1;

    public ContaBancaria(Double saldo) {
        this.numeroConta = incremento;
        this.saldo = saldo;
        incremento++;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "Numero Conta " + numeroConta +
                ", Saldo R$" + saldo +
                '}';
    }
}
