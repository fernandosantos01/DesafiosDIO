package PrimeiraEtapa.Questao23.test;

import PrimeiraEtapa.Questao23.dominio.Professor;

import java.util.Scanner;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Professor professor = new Professor("João Felix", 28, 50, 44);
        professor.calculoSalarioLiquidoFinal();
    }
}
