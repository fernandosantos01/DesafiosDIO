package PrimeiraEtapa.Questao03.dominio;

public class Processamento {
    int resul;

    public void imprimeSomaOuMulti(int num1, int num2) {
        if (num1 == num2) {
            this.resul = num1 + num2;
            System.out.println("Valor da Soma: " + resul);
        } else {
            this.resul = num1 * num2;
            System.out.println("Valor da Multiplicação: " + resul);
        }
    }
}
