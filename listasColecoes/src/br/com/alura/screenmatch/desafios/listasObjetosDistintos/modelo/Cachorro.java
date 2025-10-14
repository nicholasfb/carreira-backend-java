package br.com.alura.screenmatch.desafios.listasObjetosDistintos.modelo;

public class Cachorro extends Animal{
    private String nome;
    private String raca;
    private Integer idade;

    public Cachorro(String cor, String genero, String familia, String tipo, String nome, String raca, Integer idade) {
        super(cor, genero, familia, tipo);
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return """
                Cachorro
                Nome: %s
                Raça: %s
                Idade: %d
                Gênero: %s
                Cor: %s
                """.formatted(nome, raca, idade, getGenero(), getCor());
    }
}
