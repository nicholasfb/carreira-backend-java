package br.com.alura.soundmatch.modelo;

public class Audio {
    private String titulo;
    private int totalCurtidas;
    private int totalReproducoes;
    private int classificacoes;

    public String getTitulo() {
        return titulo;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getClassificacoes() {
        return classificacoes;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }
}
