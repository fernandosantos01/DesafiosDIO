package PrimeiraEtapa.Questao22.test;

import java.util.Scanner;

public class QuocienteAndRestoDivisao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 2 Valores: ");
        double a = in.nextDouble();
        double b = in.nextDouble();

        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            double quociente = a / b;
            double resto = a % b;

            // Exibe os resultados
            System.out.println("O valor do Quociente e o Resto da divisão entre " + a + " e " + b + " é:");
            System.out.println("Quociente: " + quociente);
            System.out.println("Resto: " + resto);
        }

        in.close();
    }
}