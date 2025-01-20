package PrimeiraEtapa.Questao01.test;

import PrimeiraEtapa.Questao01.dominio.SomaDeValores;

public class SomaDeValoresTest {
    public static void main(String[] args) {
        SomaDeValores soma = new SomaDeValores(18, 25, 50);
        soma.imprimirSomaAeB();
        soma.imprimeSeEhMenor();
    }
}
