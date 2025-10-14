package br.com.alura.screenmatch.desafios.listasObjetosDistintos.modelo;

public class Animal {
    private String cor;
    private String genero;
    private String familia;
    private String tipo;

    public Animal(String cor, String genero, String familia, String tipo) {
        this.cor = cor;
        this.genero = genero;
        this.familia = familia;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
