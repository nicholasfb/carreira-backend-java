package desafios.consultaAPI.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalBuscaCriptoMoeda {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Consumindo a API Coin Gecko para buscar cotação de criptomoedas
        //Necessário inserir a API Coin Gecko plano demo para consumir a API
        String apiKey = "";
        Scanner rd = new Scanner(System.in);
        System.out.println("Digite o nome da criptomoeda que deseja saber o valor em R$(BRL): ");
        String buscaCriptoMoeda = rd.nextLine().replace(" ", "%20");

        String endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=brl&names="+ buscaCriptoMoeda
                + "&x_cg_demo_api_key=" + apiKey;


        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
