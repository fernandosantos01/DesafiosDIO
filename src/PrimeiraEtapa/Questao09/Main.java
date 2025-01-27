package PrimeiraEtapa.Questao09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = in.nextDouble();
        System.out.println("Digite sua Altura: ");
        double altura = in.nextDouble();

        double imc = peso/(altura * altura);
        System.out.printf("SEU IMC: %.1f",imc);
        if (imc < 18.5) {
            System.out.println(" Abaixo de 18,5   | Abaixo do peso   ");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Entre 18,6 e 24,9 | Peso ideal (parabéns)");
        } else if (imc > 25.0 && imc < 29.9) {
            System.out.println("Entre 25,0 e 29,9 | Levemente acima do peso");
        } else if (imc > 30.0 && imc < 34.9) {
            System.out.println("Entre 30,0 e 34,9 | Obesidade grau I ");
        } else if (imc > 35.0 && imc < 39.9) {
            System.out.println(" Entre 35,0 e 39,9 | Obesidade grau II (severa)");
        } else if (imc > 40.0) {
            System.out.println("Maior ou igual a 40 | Obesidade grau III (mórbida)");
        }
    }
}
