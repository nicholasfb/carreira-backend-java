package br.com.alura.exemplointerface;

public class Servico implements Tributavel{
    private String descricao;
    private double valor;
    private double aliquotaISS;


    @Override
    public double getValorImposto() {
        return this.valor * this.aliquotaISS / 100;
    }


}
