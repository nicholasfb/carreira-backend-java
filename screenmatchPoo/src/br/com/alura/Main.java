package br.com.alura;

import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();

        meuFilme.setNome("A forma da água");
        meuFilme.setAnoDeLancamento(2018);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
