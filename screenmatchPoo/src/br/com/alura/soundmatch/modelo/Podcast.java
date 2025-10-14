package br.com.alura.soundmatch.modelo;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return """
                Nome do Podcast: %s
                Host: %s
                Descrição: %s
                Reproduções: %d
                Curtidas: %d
                """.formatted(getTitulo(),host, descricao, getTotalReproducoes(), getTotalCurtidas());
    }

    @Override
    public int getClassificacoes() {
        if (getTotalCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
