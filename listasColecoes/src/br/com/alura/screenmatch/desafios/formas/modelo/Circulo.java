package br.com.alura.screenmatch.desafios.formas.modelo;

import br.com.alura.screenmatch.desafios.formas.Forma;

public class Circulo implements Forma {
    private final double VALORPI = Math.PI;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return VALORPI * Math.pow(raio, 2);
    }
}
