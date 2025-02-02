package PrimeiraEtapa.Questao24.test;

import PrimeiraEtapa.Questao24.dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a Marca e Modelo do carro: ");
        String marca = in.next();
        String modelo = in.next();
        System.out.println("Digite o tempo gasto na viagem e a velocidade media: ");
        double tempo = in.nextDouble();
        double velmedia = in.nextDouble();

        Carro carro = new Carro(marca,modelo ,tempo,velmedia);

        carro.quantidadeDeLitrosDeCombustivelGastosEmUmaViagem();
    }
}
