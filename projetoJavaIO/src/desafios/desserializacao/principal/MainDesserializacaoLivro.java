package desafios.desserializacao.principal;

import com.google.gson.Gson;
import desafios.desserializacao.modelo.Livro;

public class MainDesserializacaoLivro {
    public static void main(String[] args) {
        String livro = """
                {
                    "titulo": "Harry Potter e a Pedra Filosofal",
                    "autor": "J.K Rowling",
                    "editora":{
                        "nome": "Harper Collins Brasil",
                        "paisNacionalidade": "São Paulo"
                    }
                }
                
                """;
        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Gson gson = new Gson();

        Livro livroJson = gson.fromJson(livro, Livro.class);
        Livro livroJson2 = gson.fromJson(jsonLivro, Livro.class);

        System.out.println(livroJson);
        System.out.println(livroJson2);
    }
}
