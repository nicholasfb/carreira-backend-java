public class Principal {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");

        String filme = "Filme: Maverick";
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String sinopse = "Filme de ação com o Tom Cruise";
        String genero = "\nAção";

        System.out.println(filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        System.out.println("Sinopse: " + sinopse);

        System.out.println("Utilizando o textblock que foi lançado no Java 15");

        System.out.println("""
                Utilizando
                String com
                textblock
                """);

        int classificacao = (int) (media/2);
        System.out.println("Média: " + classificacao);

        sinopse = sinopse.concat("!");

        System.out.println(sinopse);
    }
}
