package PrimeiraEtapa.Questao12.dominio;

public enum TipoPagamento {
    DEBITO(1,"À Vista em Dinheiro"){
        @Override
        public double calcularTaxa(double preco) {
            return preco * 0.85; // 15% de desconto
        }
    },
    PIX(2, "À Vista No Pix") {
        @Override
        public double calcularTaxa(double preco) {
            return preco * 0.85; // 15% de desconto
        }
    },
    CREDITO_AVISTA(3, "À Vista no Cartão de Crédito") {
        @Override
        public double calcularTaxa(double preco) {
            return preco * 0.90; // 10% de desconto
        }
    },
    CREDITO_2X(4, "Parcelado no Cartão em 2x") {
        @Override
        public double calcularTaxa(double preco) {
            return preco; // Sem desconto ou juros
        }
    },
    CREDITO_3X(5, "Parcelado no Cartão em 3x ou mais") {
        @Override
        public double calcularTaxa(double preco) {
            return preco * 1.10; // 10% de juros
        }
    };

    private final String nomeRelatorio;
    private final int codigo;

    TipoPagamento(int codigo, String nomeRelatorio) {
        this.codigo = codigo;
        this.nomeRelatorio = nomeRelatorio;
    }

    public abstract double calcularTaxa(double preco);

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getCodigo() {
        return codigo;
    }

    public static TipoPagamento fromCodigo(int codigo) {
        for (TipoPagamento tipo : TipoPagamento.values()) {
            if (tipo.getCodigo() == codigo) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Código de pagamento inválido!");
    }
}
