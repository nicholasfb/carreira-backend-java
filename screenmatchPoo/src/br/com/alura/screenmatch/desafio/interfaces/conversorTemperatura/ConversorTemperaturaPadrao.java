package br.com.alura.screenmatch.desafio.interfaces.conversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public double celsiusParaFahrenheit(double valorCelsius) {
        return (1.8 * valorCelsius) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double valorFahrenheit) {
        return (valorFahrenheit -32) * 5/9;
    }
}
