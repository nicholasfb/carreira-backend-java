import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        while (nota != -1) {
            System.out.println("Digite a nota da sua avaliação parao filme ou -1 para encerrar:");
            nota = rd.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
        }

        double media = mediaAvaliacao / totalDeNotas;

        System.out.format("Média final: %.1f", media);
    }
}
