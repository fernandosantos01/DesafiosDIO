package PrimeiraEtapa.Questao18.test;

import PrimeiraEtapa.Questao18.dominio.Crescimento;

import java.util.Scanner;

public class CrescimentoTest01 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Digitem seus nome: ");
//        String nome01 = in.next();
//        String nome02 = in.next();
//        System.out.println("Digitem suas alturas: ");
//        double altura01 = in.nextDouble();
//        double altura02 = in.nextDouble();
//
        Crescimento crescimento = new Crescimento(1.50, "Francisco", 1.10, "Anna");
        crescimento.calculaCrescimento();


    }
}
