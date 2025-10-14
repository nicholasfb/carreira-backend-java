package br.com.alura.screenmatch.desafio.interfaces.conversorTemperatura;

public class TesteTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao ctp = new ConversorTemperaturaPadrao();

        System.out.println("A temperatura de 34ºC em Fahrenheit é de " + ctp.celsiusParaFahrenheit(34) +"ºF");
        System.out.println("A temperatura de 93,2ºF em Celsius é de " + ctp.fahrenheitParaCelsius(93.2) +"ºC");
    }
}
