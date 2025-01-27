package PrimeiraEtapa.Questao08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux;
        int menor = 0;
        // primeiro vou receber um valor e armazenar em uma variavel
        System.out.println("Digite a quantidade de numeros que você vai inserir: ");
        int quant = in.nextInt();

        int[] v = new int[quant];
        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o numero: ");
            v[i] = in.nextInt();
        }
        for (int i = v.length - 1; i > 0; i--) {
            aux = 0;
            for (int j = 0; j < i; j++) {
                if (v[j] > v[j + 1]) {
                    menor = v[j + 1];
                    v[j + 1] = v[j];
                    v[j] = menor;
                    aux++;
                }
            }
            if (aux == 0) {
                break;
            }
        }
        System.out.println("O menor numero: " + v[0] + "\n---------------------------");
        System.out.println("Numeros ordenados em ordem decrecente!");
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.println(v[i]);
        }
        in.close();
    }
}
