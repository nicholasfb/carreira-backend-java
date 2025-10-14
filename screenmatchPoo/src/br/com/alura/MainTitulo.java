package br.com.alura;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.CurtaMetragem;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class MainTitulo {
    public static void main(String[] args) {
        Serie serieLost = new Serie();

        serieLost.setNome("Lost");
        serieLost.setAtiva(false);
        serieLost.setTemporadas(10);
        serieLost.setEpisodios(10);
        serieLost.setAnoDeLancamento(2006);
        serieLost.setMinutosEpisodio(50);
        serieLost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + serieLost.getDuracaoEmMinutos());


        Filme meuFilme = new Filme();
        meuFilme.setNome("Scarface");
        meuFilme.setAnoDeLancamento(1982);
        meuFilme.setDuracaoEmMinutos(156);


        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);

        System.out.println(calculadoraDeTempo.getTempoTotal());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        calculadoraDeTempo.inclui(outroFilme);

        System.out.println(calculadoraDeTempo.getTempoTotal());

        calculadoraDeTempo.inclui(serieLost);

        CurtaMetragem curta = new CurtaMetragem();

        curta.setNome("Obelisk");
        curta.setDiretor("Padinsky");
        curta.setAnoDeLancamento(2025);
        curta.setDuracaoEmMinutos(89);

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serieLost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
