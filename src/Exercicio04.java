import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Exercicio04 {

	private final static double DESCONTO = 0.1f;
	private final static byte QUANTIDADE_MAXIMA_PARA_DESCONTO = 10;

	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		telaDeBoasVindas();
		double valorDoProduto = (double) perguntaValorDoProduto();
		byte quantidadeDoProduto = (byte) perguntaQuantidadeDoProduto();
		double subTotal = calculaSubTotal(valorDoProduto, quantidadeDoProduto);
		mostraResultado(quantidadeDoProduto, subTotal);
		
		scanner.close();
	}
	
	
	private static void telaDeBoasVindas() {

		System.out.println("     |         	  BEM-VINDO A NOSSA LOJA              	|\n     |    CALCULE SE TERÁ DIREITO AO DESCONTO DE 10%    |");
		System.out.print("     |__________________________________________________|\n");
	}
	private static double perguntaValorDoProduto() {
		System.out.print("\nDIGITE O VALOR DO PRODUTO: ");
		double valorDoProduto = scanner.nextDouble();
		return valorDoProduto;
	}	
	private static double perguntaQuantidadeDoProduto() {
		System.out.print("DIGITE A QUANTIDADE: ");
		byte quantidadeDoProduto = scanner.nextByte();
		return quantidadeDoProduto;
	}

	
	private static double calculaSubTotal(double valorDoProduto, byte quantidadeDoProduto) {
		if (valorDoProduto > 0) {
			return  (valorDoProduto * quantidadeDoProduto);			
		} else {
			System.out.println("\n\nPOR FAVOR, DIGITE UM VALOR MAIOR QUE ZERO.");
		}
		return 0;
		
	}
	
	private static void mostraResultado(byte quantidadeDoProduto, double subTotal) {
		boolean resultadoBoolean = quantidadeDoProduto > QUANTIDADE_MAXIMA_PARA_DESCONTO;	
		boolean resultadoQuantidadeDeProdutoMinima = quantidadeDoProduto > 0;
		
		if (resultadoBoolean) {
			double valorPercentualDeDesconto = ((subTotal * DESCONTO));
			double valorTotalComDesconto = (subTotal - valorPercentualDeDesconto);
			
			System.out.printf("\n\nO VALOR TOTAL COM DESCONTO É R$ %.2f", valorTotalComDesconto);
			
		} else if (resultadoQuantidadeDeProdutoMinima) {
			System.out.printf("\n\nO VALOR TOTAL É R$ %.2f", subTotal);
		} else {
			System.out.println("\n\nVOCÊ NÃO COMPROU NADA. REEXECUTE O PROGRAMA");
		}
	}

}
