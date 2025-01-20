package PrimeiraEtapa.Questao04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int a = in.nextInt();

        System.out.println("Valor Antecessor: " + (a - 1) + " Valor Sucessor: " + (a + 1));
    }
}
