package PrimeiraEtapa.Questao13.test;

import PrimeiraEtapa.Questao13.dominio.Pessoa;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = in.next();
        System.out.println("Digite sua Idade: ");
        int idade = in.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);
        pessoa.maiorIdade();
    }
}
