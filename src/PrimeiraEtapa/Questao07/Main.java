package PrimeiraEtapa.Questao07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um valor booleano: ");
        boolean a = in.nextBoolean();
        boolean b = in.nextBoolean();

        if (a == true && b == true) {
            System.out.println("Ambos são verdadeiras");
        } else if (a == true && b == false) {
            System.out.println("A é verdadeiro e B é falsa");
        } else if (a == false && b == true) {
            System.out.println("A é falso e B é veradeira");
        } else if (a ==  false && b == false) {
            System.out.println("Ambos são falsos");
        }
    }
}
