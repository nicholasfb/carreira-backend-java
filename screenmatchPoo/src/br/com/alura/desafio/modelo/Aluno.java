package br.com.alura.desafio.modelo;

public class Aluno {
    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calculaMedia(double[] notas) {
        double media = 0.0;
        for (double nota : notas) {
            media += nota;
        }
        return media/notas.length;
    }
}
