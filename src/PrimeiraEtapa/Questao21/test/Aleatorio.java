package PrimeiraEtapa.Questao21.test;

import java.util.Random;

public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int valor = random.nextInt(101);
        System.out.println("Valor: " + valor);
    }
}
