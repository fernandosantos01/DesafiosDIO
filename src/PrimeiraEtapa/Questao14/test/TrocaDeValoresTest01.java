package PrimeiraEtapa.Questao14.test;

import PrimeiraEtapa.Questao14.dominio.TrocaDeValores;

import java.util.Scanner;

public class TrocaDeValoresTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite Respectivamente o valor de A e B: ");
        int a = in.nextInt();
        int b = in.nextInt();

        TrocaDeValores trocaDeValores = new TrocaDeValores(a, b);
        trocaDeValores.troca();
    }
}
