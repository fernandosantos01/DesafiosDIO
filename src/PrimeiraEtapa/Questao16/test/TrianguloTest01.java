package PrimeiraEtapa.Questao16.test;

import PrimeiraEtapa.Questao16.dominio.Triangulo;

import java.util.Scanner;

public class TrianguloTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite os valores dos lados: ");
        double ladoA = in.nextDouble();
        double ladoB = in.nextDouble();
        double ladoC = in.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);

        triangulo.tipoTriangulo();
    }
}
