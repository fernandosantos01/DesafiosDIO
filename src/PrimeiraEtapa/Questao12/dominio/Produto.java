package PrimeiraEtapa.Questao12.dominio;

public class Produto {
    private TipoPagamento tipoPagamento;
    private String nomeProduto;
    private double valor;
    private int quant;

    public Produto(TipoPagamento tipoPagamento, String nomeProduto, double valor, int quant) {
        this.tipoPagamento = tipoPagamento;
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.quant = quant;
    }

    public double calculaValorFinalProduto() {
        double valorBase = quant * valor;
        return tipoPagamento.calcularTaxa(valorBase);
    }

    @Override
    public String toString() {
        return "Nome do Produto: " + nomeProduto +
                ", Valor Unitário: " + valor +
                ", Quantidade: " + quant +
                ", Forma de Pagamento: " + tipoPagamento.getNomeRelatorio();
    }

    // Getters e Setters
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
}
