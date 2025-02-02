package PrimeiraEtapa.Questao24.dominio;

public class Carro {
    private final int kmporlitro = 12;
    private String marca;
    private String modelo;
    private double tempoGastoNaViagem;
    private double velMedia;

    public Carro(String marca, String modelo, double tempoGastoNaViagem, double velMedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.tempoGastoNaViagem = tempoGastoNaViagem;
        this.velMedia = velMedia;
    }

    public void quantidadeDeLitrosDeCombustivelGastosEmUmaViagem() {
        double distancia = tempoGastoNaViagem * velMedia;

        double litrosUsados = distancia / kmporlitro;

        System.out.println("A quantidade de litros de combustível gastos em uma viagem: " + litrosUsados);
    }

    public int getKmporlitro() {
        return kmporlitro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTempoGastoNaViagem() {
        return tempoGastoNaViagem;
    }

    public void setTempoGastoNaViagem(double tempoGastoNaViagem) {
        this.tempoGastoNaViagem = tempoGastoNaViagem;
    }

    public double getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(double velMedia) {
        this.velMedia = velMedia;
    }
}
