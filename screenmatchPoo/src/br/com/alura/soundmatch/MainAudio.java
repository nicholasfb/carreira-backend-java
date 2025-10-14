package br.com.alura.soundmatch;

import br.com.alura.soundmatch.modelo.MinhasPreferidas;
import br.com.alura.soundmatch.modelo.Musica;
import br.com.alura.soundmatch.modelo.Podcast;

public class MainAudio {
    public static void main(String[] args) {

        Musica m1 = new Musica();
        m1.setTitulo("505");
        m1.setArtista("Arctic Monkeys");
        m1.setGenero("Rock");
        m1.setAlbum("Favourite Nightmare");

        for (int i = 0; i < 1000; i++) {
            m1.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            m1.curtir();
        }

        Podcast p1 = new Podcast();

        p1.setTitulo("Ponto Hipsters - Entrevista com Nico Steppat");
        p1.setDescricao("Um podcast de conversas e comentários descontraídos e informativos sobre o mundo da tecnologia");
        p1.setHost("Paulo Silveira");

        for (int i = 0; i < 500; i++) {
            p1.reproduzir();
        }

        for (int i = 0; i < 25; i++) {
            p1.curtir();
        }

        MinhasPreferidas mp1 = new MinhasPreferidas();

        mp1.inclui(m1);
        mp1.inclui(p1);

        System.out.println(m1.toString());
        System.out.println(p1.toString());
    }
}
