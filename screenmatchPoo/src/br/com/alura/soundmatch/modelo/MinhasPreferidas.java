package br.com.alura.soundmatch.modelo;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacoes() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluta e preferido por todos");
        } else {
            System.out.println(audio.getTitulo() + " também é um dos que todos estão curtindo!");
        }
    }
}
