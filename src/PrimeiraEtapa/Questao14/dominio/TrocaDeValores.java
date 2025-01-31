package PrimeiraEtapa.Questao14.dominio;

public class TrocaDeValores {
    private int valorA;
    private int valorB;

    public TrocaDeValores(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public void troca() {
        System.out.println("Os Antigos valores de A e B respectivamente: " + valorA + " " + valorB);
        int aux;
        aux = valorB;
        valorB = valorA;
        valorA = aux;
        System.out.println("Agora os Valores de A e B são: " + valorA + " " + valorB);
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
}
