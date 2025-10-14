package br.com.alura.screenmatch.desafio.interfaces.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int valor) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " X " + i + " = " + i*valor);
        }
    }
}
