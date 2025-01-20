package PrimeiraEtapa.Questao05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        enquanto salario recebido for maior que o salario minimo divida e incremente
        Scanner in = new Scanner(System.in);
        int salarios = 0;
        System.out.println("Digite o valor do salario minimo e o valor do seu salario: ");
        double salMinimo = in.nextDouble();
        double salRecebido = in.nextDouble();
        if (salMinimo > salRecebido) {
            System.out.println("Valor Inferior a 1 salario minimo!");
            return;
        } else {
            while (salMinimo <= salRecebido) {
                salarios++;
                salRecebido -= salMinimo;
            }
        }
        System.out.println("São " + salarios + " Salarios minimos");
    }
}
