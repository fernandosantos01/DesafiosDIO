package PrimeiraEtapa.Questao19.test;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("--------TABUDADA---------");
        for (int i = 1; i <= 10; i++) {

            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j,i*j);
            }
            System.out.println("--------------------");
        }
    }
}
