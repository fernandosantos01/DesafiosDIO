package PrimeiraEtapa.Questao20.test;

import java.util.Scanner;

public class TabuadaUsuario {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero que você deseja saber a tabuada e até qual número: ");
        int numTabu = in.nextInt();
        int numLim = in.nextInt();
        System.out.println("--------TABUADA--------");
        for (int i = 0; i <= numLim; i++) {
            System.out.printf("%d x %d = %d\n",numTabu, i, numTabu*i);
        }
    }
}
