import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = rd.nextLine();

        System.out.println("Em qual ano que foi lançado o filme?");
        Integer anoDeLancamento = rd.nextInt();

        System.out.println("Qual é a sua nota de avaliação para o filme?");
        Double notaAvaliacao = rd.nextDouble();

        System.out.println(
                """
                ============ Ficha do seu Filme Favorito ============
                = Nome do Filme: %s                                  =
                = Ano de lançamento: %d                              =
                = Sua avaliação: %.1f                                =
                =====================================================

                """.formatted(filme, anoDeLancamento, notaAvaliacao)
        );

    }
}
