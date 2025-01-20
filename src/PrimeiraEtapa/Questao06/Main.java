package PrimeiraEtapa.Questao06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int a = in.nextInt();

        System.out.println("Valor com reajuste: "+(a+(a*0.05)));
    }
}
