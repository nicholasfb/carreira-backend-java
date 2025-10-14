import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota da sua avaliação parao filme:");
            nota = rd.nextDouble();
            mediaAvaliacao += nota;
        }

        double media = mediaAvaliacao / 3;

        System.out.format("Média final: %.1f", media);
    }
}
