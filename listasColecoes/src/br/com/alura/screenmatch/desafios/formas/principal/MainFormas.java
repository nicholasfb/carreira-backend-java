package br.com.alura.screenmatch.desafios.formas.principal;

import br.com.alura.screenmatch.desafios.formas.Forma;
import br.com.alura.screenmatch.desafios.formas.modelo.Circulo;
import br.com.alura.screenmatch.desafios.formas.modelo.Quadrado;

import java.util.ArrayList;

public class MainFormas {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4.0);
        Circulo circulo = new Circulo(5.0);
        //System.out.println("A área do Quadrado é de " + (int) quadrado.calcularArea() + "cm²");
        //System.out.println("A área do Círculo é de " + (int) circulo.calcularArea() + "cm²");

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(quadrado);
        listaFormas.add(circulo);

        for (Forma forma : listaFormas) {
            System.out.println("Área " + (int) forma.calcularArea() + "cm²");
        }
    }
}
