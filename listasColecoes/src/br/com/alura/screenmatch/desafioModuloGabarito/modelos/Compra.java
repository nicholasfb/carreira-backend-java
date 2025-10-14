package br.com.alura.screenmatch.desafioModuloGabarito.modelos;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;

    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra:" + "descricao= " + descricao +  ", valor= R$" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return ((Double) this.getValor()).compareTo(outraCompra.getValor());
    }
}
