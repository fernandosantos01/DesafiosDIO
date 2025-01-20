package PrimeiraEtapa.Questao01.dominio;

public class SomaDeValores {
    int valA;
    int valB;
    int valC;
    int soma;

    public SomaDeValores(int valA, int valB, int valC) {
        this.valA = valA;
        this.valB = valB;
        this.valC = valC;
    }

    public void imprimirSomaAeB() {
        this.soma = this.valA + this.valB;
        System.out.println("Valor da Soma de " + this.valA + " + " + this.valB + " = " + this.soma);
    }

    public void imprimeSeEhMenor() {
        if (this.soma > this.valC) {
            System.out.println("A soma é maior que o Valor C");
        } else if (this.soma<this.valC) {
            System.out.println("A soma é menor que o valor C");
        }else {
            System.out.println("A soma de A e B é igual a C");
        }
    }


}
