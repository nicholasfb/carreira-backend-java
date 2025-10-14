package br.com.alura.desafio.modelo;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibeDetalhes(){
        System.out.println("""
                ********* INFORMAÇÕES TÉCNICAS DO LIVRO *********
                Nome do livro: %s
                Autor: %s
                """.formatted(this.titulo, this.autor));
    }
}
