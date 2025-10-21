package desafios.exceptions;

import com.google.gson.Gson;
import desafios.modelos.UsuarioGithub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaUsuarioGitHub {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);

        System.out.println("Qual o nome de usuário que procura no Git Hub: ");
        String usuario = rd.nextLine().replace(" ", "%20");

        String endereco = "https://api.github.com/users/" + usuario;

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado!");
            }

            String json = response.body();
            System.out.println(json);

            Gson gson = new Gson();
            UsuarioGithub user = gson.fromJson(json, UsuarioGithub.class);
            System.out.println(user.toString());
        } catch (IOException | InterruptedException e ) {
            System.out.println("Opss... Houve um erro durante à consulta da API do Github");
            e.printStackTrace();
        }
        catch(ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}
