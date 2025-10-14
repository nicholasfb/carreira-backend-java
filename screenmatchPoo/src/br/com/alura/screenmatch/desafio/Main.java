package br.com.alura.screenmatch.desafio;

import br.com.alura.screenmatch.desafio.modelo.ContaCorrente;
import br.com.alura.screenmatch.desafio.modelo.GeradorPrimo;
import br.com.alura.screenmatch.desafio.modelo.NumerosPrimos;
import br.com.alura.screenmatch.desafio.modelo.VerificadorPrimo;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();

        cc.depositar(200.0);
        System.out.println(cc.getSaldo());

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificaSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.geradorProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}
