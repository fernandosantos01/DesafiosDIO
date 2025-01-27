package PrimeiraEtapa.Questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double media = 0.0;

        double[]notas = new double[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a sua "+i+1+": ");
            notas[i] = in.nextDouble();
        }
        for (double nota: notas){
            media += nota;
        }
        System.out.printf("O valor da media é: %.2f",media/3);
    }
}
