package PrimeiraEtapa.Questao15.dominio;

public class DataNascimento {
    private final int ANO_ATUAL = 2025;
    private final int MES_ATUAL = 1;
    private final int DIA_ATUAL = 27;

    private int anoDeNascimento;
    private int mesDeNascimento;
    private int diaDeNascimento;

    public DataNascimento(int anoDeNascimento, int mesDeNascimento, int diaDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
        this.mesDeNascimento = mesDeNascimento;
        this.diaDeNascimento = diaDeNascimento;
    }

    public void calculaTempoVivido() {
        int anosVividos = ANO_ATUAL - anoDeNascimento;
        int mesesVividos = MES_ATUAL - mesDeNascimento;
        int diasVividos = DIA_ATUAL - diaDeNascimento;

        if (diasVividos < 0) {
            diasVividos += 30;
            mesesVividos--;
        }
        if (mesesVividos < 0) {
            mesesVividos += 12;
            anosVividos--;
        }

        System.out.println("Tempo de vida:");
        System.out.println(anosVividos + " ano(s), " + mesesVividos + " mês(es) e " + diasVividos + " dia(s).");
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public int getMesDeNascimento() {
        return mesDeNascimento;
    }

    public void setMesDeNascimento(int mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }

    public int getDiaDeNascimento() {
        return diaDeNascimento;
    }

    public void setDiaDeNascimento(int diaDeNascimento) {
        this.diaDeNascimento = diaDeNascimento;
    }
}
