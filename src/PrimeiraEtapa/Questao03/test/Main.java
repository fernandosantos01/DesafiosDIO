package PrimeiraEtapa.Questao03.test;

import PrimeiraEtapa.Questao03.dominio.Processamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Processamento processamento = new Processamento();
        System.out.println("Digite Dois Valores: ");
        int a = in.nextInt();
        int b = in.nextInt();


        processamento.imprimeSomaOuMulti(a, b);
    }
}
