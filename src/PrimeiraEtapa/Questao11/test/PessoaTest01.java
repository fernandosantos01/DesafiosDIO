package PrimeiraEtapa.Questao11.test;

import PrimeiraEtapa.Questao11.dominio.Aluno;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite as notas: ");
        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            notas[i] = in.nextDouble();
        }
        Aluno aluno01 = new Aluno("José Fernando", 18, notas);
        System.out.printf("A media: %.2f", aluno01.calculaMedia());

    }
}
