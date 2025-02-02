package PrimeiraEtapa.Questao17.dominio;

public class Temperatura {
    private double temperatura;

    public Temperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void conversorDeTemperatura() {
        double cel = (5 * (temperatura - 32) / 9);
        System.out.printf("Valor da temperatura em Celsius: %.2f", cel);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}
