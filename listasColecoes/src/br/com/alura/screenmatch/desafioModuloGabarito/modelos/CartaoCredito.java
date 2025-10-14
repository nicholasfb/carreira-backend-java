package br.com.alura.screenmatch.desafioModuloGabarito.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limiteCartao;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldo = limiteCartao;
        this.compras = new ArrayList<>();
    }


    public double getLimiteCartao() {
        return limiteCartao;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean lancaCompras(Compra compra) {
        if(this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }
}
