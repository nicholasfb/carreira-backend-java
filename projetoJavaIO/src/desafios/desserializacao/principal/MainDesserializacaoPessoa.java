package desafios.desserializacao.principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import desafios.desserializacao.modelo.Pessoa;

public class MainDesserializacaoPessoa {
    public static void main(String[] args) {
        String json = """
            {
                "nome": "Jason",
                "idade": 31,
                "profissao": "Professor"
            }
            """;
        String json2 = """
            {
                "nome": "Freddy",
                "idade": 30,
                "cidade": "São Paulo"
            }
            """;
        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();

        Pessoa pessoaJson =  gson.fromJson(json, Pessoa.class);
        System.out.println(pessoaJson);

        Gson gsonBuilder = new GsonBuilder().setLenient().create();
        Pessoa pessoaJson2 = gsonBuilder.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoaJson2);
    }
}
