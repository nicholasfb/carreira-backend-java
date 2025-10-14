package br.com.alura.screenmatch.desafio.modelo;

public class ContaBancaria {
    protected Double saldo;

    public ContaBancaria() {
        this.saldo = 0.0;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar(Double valor){
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(Double valor) {
        saldo = saldo + valor;
    }

    public Double consultarSaldo(){
        return saldo;
    }
}
