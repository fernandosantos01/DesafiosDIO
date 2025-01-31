package PrimeiraEtapa.Questao15.test;

import PrimeiraEtapa.Questao15.dominio.DataNascimento;

import java.util.Scanner;

public class DataNascimentoTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = in.nextInt();

        System.out.println("Digite o mês de nascimento (1-12): ");
        int mesNascimento = in.nextInt();

        System.out.println("Digite o dia de nascimento (1-30): ");
        int diaNascimento = in.nextInt();

        DataNascimento dataNascimento = new DataNascimento(anoNascimento, mesNascimento, diaNascimento);
        dataNascimento.calculaTempoVivido();
    }
}
