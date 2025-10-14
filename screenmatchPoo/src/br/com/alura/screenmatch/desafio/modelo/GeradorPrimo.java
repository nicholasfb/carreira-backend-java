package br.com.alura.screenmatch.desafio.modelo;

public class GeradorPrimo extends NumerosPrimos{

    public int geradorProximoPrimo(int ultimoPrimoConhecido){
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }

        return proximoNumero;
    }
}
