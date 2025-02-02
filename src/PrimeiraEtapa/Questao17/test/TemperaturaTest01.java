package PrimeiraEtapa.Questao17.test;

import PrimeiraEtapa.Questao17.dominio.Temperatura;

import java.util.Scanner;

public class TemperaturaTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da temperatura em Fahrenheit: ");
        double tempe = in.nextDouble();

        Temperatura temperatura = new Temperatura(tempe);
        temperatura.conversorDeTemperatura();
    }
}
