package br.com.alura.screenmatch.desafioModuloMeu.modelo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compra {
    static List<Produto> listaProdutos = new ArrayList<>();
    private Double limiteCartao;

    public Double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(Double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public boolean adicionaProduto(Produto produto) {
        if(limiteCartao < produto.getPrecoProduto()) {
            System.out.println("Não há saldo para essa compra");
            return false;
        }
            listaProdutos.add(produto);
            setLimiteCartao(getLimiteCartao() - produto.getPrecoProduto());
            System.out.println("Compra realizada!");
            return true;
    }

    public void exibeCompras() {
        listaProdutos.sort(Comparator.comparing(Produto::getPrecoProduto));
        System.out.println("""
                ********************
                COMPRAS REALIZADAS:
                """);
        for (Produto produto : listaProdutos) {
            System.out.println(" %s - R$%.1f ".formatted(produto.getNomeProduto(),produto.getPrecoProduto()));
        }
        System.out.println("""
                
                ********************
                
                Saldo restante do cartão: R$%.2f
                """.formatted(getLimiteCartao()));
    }
}
