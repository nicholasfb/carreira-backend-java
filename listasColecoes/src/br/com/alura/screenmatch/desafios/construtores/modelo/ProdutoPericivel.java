package br.com.alura.screenmatch.desafios.construtores.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPericivel extends Produto{
    private LocalDate dataPericivel;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ProdutoPericivel(String nome, Double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    public ProdutoPericivel(String nome, Double preco, Integer quantidade, LocalDate dataPericivel){
        super(nome, preco, quantidade);
        this.dataPericivel = dataPericivel;
    }

    public LocalDate getDataPericivel() {
        return dataPericivel;
    }

    public void setDataPericivel(LocalDate dataPericivel) {
        this.dataPericivel = dataPericivel;
    }

    @Override
    public String toString() {
        return """
                Produto: %s
                Preco: R$%.2f
                Quantidade em estoque: %d
                Data de Validade: %s
                """.formatted(super.getNome(), super.getPreco(), super.getQuantidade(), dataPericivel.format(formatter));
    }
}
