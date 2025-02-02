package PrimeiraEtapa.Questao18.dominio;

public class Crescimento {
    private double altura01;
    private String nome01;
    private double altura02;
    private String nome02;
    private boolean aux = true;
    private int tempo = 0;

    public Crescimento(double altura01, String nome01, double altura02, String nome02) {
        this.altura01 = altura01;
        this.nome01 = nome01;
        this.altura02 = altura02;
        this.nome02 = nome02;
    }

    public void calculaCrescimento() {
        while (aux == true) {
            if (altura01 >= altura02) {
                altura01 += 0.02;
                altura02 += 0.03;
                tempo += 1;
            } else {
                System.out.printf("%s levou %d anos para ultrapassar a altura de %s.\nRespectivamente suas alturas: %.2f %.2f", nome02, tempo, nome01, altura02, altura01);
                aux = false;
            }
        }
    }

    public int getTempo() {
        return tempo;
    }

    public double getAltura01() {
        return altura01;
    }

    public void setAltura01(double altura01) {
        this.altura01 = altura01;
    }

    public String getNome01() {
        return nome01;
    }

    public void setNome01(String nome01) {
        this.nome01 = nome01;
    }

    public double getAltura02() {
        return altura02;
    }

    public void setAltura02(double altura02) {
        this.altura02 = altura02;
    }

    public String getNome02() {
        return nome02;
    }

    public void setNome02(String nome02) {
        this.nome02 = nome02;
    }
}
