package desafios.consultaAPI.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBuscaLivro {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Consumindo a API do Google Livros para buscar livros
        //Necessário inserir a API do Google referente ao Google Books para consumir
        String apiKey = "";
        Scanner rd = new Scanner(System.in);
        System.out.println("Digite o nome do livro que deseja buscar: ");
        String buscaLivro = rd.nextLine().replace(" ", "%20");

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + buscaLivro +"&key=" + apiKey;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
