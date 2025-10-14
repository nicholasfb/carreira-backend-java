import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        List<Integer> listaNumerosMega = new ArrayList<>();

        System.out.println("Gerando números da MegaSena");
        for (int i = 0; i < 6; i++) {
            listaNumerosMega.add(rand.nextInt(100) + 1);
        }

        Collections.sort(listaNumerosMega);

        System.out.println(listaNumerosMega);
        int qtdTentativas = 0;
        boolean venceu = false;
        while(!venceu){

            List<Integer> listaNumerosPalpite = new ArrayList<>();
            for (int i = 0; i < 6; i++) {
                listaNumerosPalpite.add(rand.nextInt(100) + 1);
            }

            Collections.sort(listaNumerosPalpite);

            System.out.println("Números da Mega Sena: " + listaNumerosMega);
            System.out.println("Números do palpite: " + listaNumerosPalpite);

            if(listaNumerosPalpite.equals(listaNumerosMega)) {
                System.out.println("\nVocê é o vencedora da Mega Sena");
                venceu = true;
            } else {
                System.out.println("\nVocê não acertou os números");
            }
            qtdTentativas++;
            System.out.println("Tentativa número " + qtdTentativas);
            Thread.sleep(500);
        }
    }
}