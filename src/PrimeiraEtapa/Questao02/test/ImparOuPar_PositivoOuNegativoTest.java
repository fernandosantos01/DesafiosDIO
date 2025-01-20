package PrimeiraEtapa.Questao02.test;

import PrimeiraEtapa.Questao02.dominio.ImparOuPar_PositivoOuNegativo;

import java.util.Scanner;

public class ImparOuPar_PositivoOuNegativoTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ImparOuPar_PositivoOuNegativo num = new ImparOuPar_PositivoOuNegativo();

        System.out.println("Digite um numero: ");
        int numero = in.nextInt();
        num.imprimeParOuImparPosNeg(numero);
    }
}
