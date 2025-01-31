package PrimeiraEtapa.Questao13.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void maiorIdade() {
        if (idade < 18) {
            System.out.println("Nome: " + nome + "\nMenor de Idade!!");
        } else {
            System.out.println("Nome: " + nome + "\nMaior de Idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
