package PrimeiraEtapa.Questao12.test;

import PrimeiraEtapa.Questao12.dominio.Produto;
import PrimeiraEtapa.Questao12.dominio.TipoPagamento;

import java.util.Scanner;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Nome do Produto: ");
        String nomeProduto = in.nextLine();

        System.out.println("Digite o valor unitário do produto: ");
        double valor = in.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        int quant = in.nextInt();

        TipoPagamento tipoPagamento = null;
        boolean pagamentoValido = false;

        do {
            System.out.println("Escolha a forma de pagamento:");
            System.out.println("1 - À Vista em Dinheiro (15% de desconto)");
            System.out.println("2 - À Vista no Pix (15% de desconto)");
            System.out.println("3 - À Vista no Cartão de Crédito (10% de desconto)");
            System.out.println("4 - Parcelado no Cartão em 2x (sem juros)");
            System.out.println("5 - Parcelado no Cartão em 3x ou mais (10% de juros)");

            int codigoPagamento = in.nextInt();

            try {
                tipoPagamento = TipoPagamento.fromCodigo(codigoPagamento);
                pagamentoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: Opção de pagamento inválida. Tente novamente.");
            }
        } while (!pagamentoValido);

        Produto produto = new Produto(tipoPagamento, nomeProduto, valor, quant);

        double valorFinal = produto.calculaValorFinalProduto();

        System.out.println("\nResumo do Pedido:");
        System.out.println(produto);
        System.out.printf("Valor Final a Pagar: R$ %.2f\n", valorFinal);
    }
}
