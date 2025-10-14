package br.com.alura.screenmatch.desafio.interfaces.salaRetangular;

public class Teste {
    public static void main(String[] args) {
        CalculadoraSalaRetangular csr = new CalculadoraSalaRetangular();

        System.out.println("A área do retângulo é: " + csr.calcularArea(12, 5));
        System.out.println("O perímetro do retângulo é: " + csr.calcularPerimetro(11, 7));
    }
}
