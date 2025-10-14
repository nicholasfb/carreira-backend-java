package br.com.alura.screenmatch.desafio.interfaces.conversaoMoeda;

public class TesteConversaoMoeda {
    public static void main(String[] args) {
        ConversorMoeda cm = new ConversorMoeda();

        System.out.println("O valor em reais é de R$ " + cm.converterDolarParaReal(100.0));

    }
}
