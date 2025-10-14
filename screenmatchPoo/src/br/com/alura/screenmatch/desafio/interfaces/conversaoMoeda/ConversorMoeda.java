package br.com.alura.screenmatch.desafio.interfaces.conversaoMoeda;

public class ConversorMoeda implements ConversaoFinanceira{
    private Double valorReal = 5.53;

    public Double getValorReal() {
        return valorReal;
    }

    public void setValorReal(Double valorReal) {
        this.valorReal = valorReal;
    }


    @Override
    public double converterDolarParaReal(Double valorDolar) {
        return valorReal * valorDolar;
    }
}
