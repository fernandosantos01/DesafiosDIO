package PrimeiraEtapa.Questao23.dominio;

public class Professor extends Pessoa {
    private final double PERCENTUAL_DESCONTO_INSS = 0.30;
    private double valorDaHoraAula;
    private int aulasLecionadasNoMes;

    public Professor(String nome, int idade, double valorDaHoraAula, int aulasLecionadasNoMes) {
        super(nome, idade);
        this.valorDaHoraAula = valorDaHoraAula;
        this.aulasLecionadasNoMes = aulasLecionadasNoMes;
    }

    public void calculoSalarioLiquidoFinal() {
        double valor = (valorDaHoraAula * aulasLecionadasNoMes);
        double valorComImpostos = valor - (valor * PERCENTUAL_DESCONTO_INSS);
        System.out.println("O valor do seu salario sem os descontos do inss: " + valor + "\nValor do seu salario com os descontos tributários: " + valorComImpostos);
    }

    public double getPERCENTUAL_DESCONTO_INSS() {
        return PERCENTUAL_DESCONTO_INSS;
    }

    public double getValorDaHoraAula() {
        return valorDaHoraAula;
    }

    public void setValorDaHoraAula(double valorDaHoraAula) {
        this.valorDaHoraAula = valorDaHoraAula;
    }

    public int getAulasLecionadasNoMes() {
        return aulasLecionadasNoMes;
    }

    public void setAulasLecionadasNoMes(int aulasLecionadasNoMes) {
        this.aulasLecionadasNoMes = aulasLecionadasNoMes;
    }
}
