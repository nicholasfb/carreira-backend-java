import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int quadra = 0,quina = 0;
        List<Integer> listaNumerosMega = new ArrayList<>();

        System.out.println("Gerando números da MegaSena");
        while (listaNumerosMega.size() < 6) {
            int numero = rand.nextInt(60) + 1;
            if (!listaNumerosMega.contains(numero)) {
                listaNumerosMega.add(numero);
            }
        }


        Collections.sort(listaNumerosMega);

        System.out.println(listaNumerosMega);
        int qtdTentativas = 0;
        boolean venceu = false;
        while(!venceu){
            List<Integer> listaNumerosAcertados = new ArrayList<>();
            List<Integer> listaNumerosPalpite = new ArrayList<>();
            while (listaNumerosPalpite.size() < 6) {
                int numero = rand.nextInt(60) + 1;
                if (!listaNumerosPalpite.contains(numero)) {
                    listaNumerosPalpite.add(numero);
                    if(listaNumerosMega.contains(numero)) {
                        listaNumerosAcertados.add(numero);
                    }
                }


            }

            Collections.sort(listaNumerosPalpite);
            Collections.sort(listaNumerosAcertados);
            System.out.println("\nNúmeros da Mega Sena: " + listaNumerosMega);
            System.out.println("Números do palpite: " + listaNumerosPalpite);
            System.out.println("Números acertados: " + listaNumerosAcertados);

            if(listaNumerosAcertados.size() == 4) {
                System.out.println("Parabéns você levou a QUADRA");
                quadra++;
            } else if(listaNumerosAcertados.size() == 5) {
                System.out.println("Parabéns você levou a QUINA");
                quina++;
            } else if(listaNumerosAcertados.size() == 6) {
                System.out.println("\nVocê é o vencedora da Mega Sena");
                venceu = true;
            } else {
                System.out.println("Você não levou nenhum prêmio");
            }

            qtdTentativas++;
            System.out.println("\nTentativa número " + qtdTentativas);
            System.out.println("Quadras acertadas: " + quadra);
            System.out.println("Quinas acertadas: " + quina);
            //Thread.sleep(1);
        }
    }
}