package PrimeiraEtapa.Questao11.dominio;

public abstract class Pessoa implements Notas {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
