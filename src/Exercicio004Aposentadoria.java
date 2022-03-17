import javax.swing.JOptionPane;

public class Exercicio004Aposentadoria {

	private static byte IDADE_MINIMA = 55;
	private static byte TEMPO_MINIMO_DE_CONTRIBUIÇÃO = 25;

	public static void main(String[] args) {

		byte escolha = ObterEscolhaDoUsuario();		
		resultadoIdadeETempoDeContribuicao(escolha);
	}

	static byte ObterEscolhaDoUsuario() {
		
		int escolha = JOptionPane.showConfirmDialog(null, "SEJA BEM-VINDO(A)! SAIBA AQUI SE VOCÊ PODE SE APOSENTAR... \n\n\n                        CLIQUE EM SIM PARA CONTINUAR.");
		
		return (byte) escolha;
	}

	static byte perguntaIdade() {
		byte idadeDoUsuario = (byte) Integer.parseInt(JOptionPane.showInputDialog(null,"POR GENTILEZA, INFORME SUA IDADE:"));
		return idadeDoUsuario;
	}
	
	static byte perguntaTempoDeContribuicao() {
		byte tempoDeContribuicao = (byte) Integer.parseInt(
				JOptionPane.showInputDialog(null,"AGORA INFORME A QUANTIDADE DE TEMPO DE CONTRIBUIÇÃO DA PREVIDÊNCIA:"));
		return tempoDeContribuicao;
	}
	
	static void resultadoIdadeETempoDeContribuicao(byte escolha) {
		if (escolha == 0) {
			byte idadeDoUsuario = perguntaIdade();
			byte tempoDeContribuicao = perguntaTempoDeContribuicao();

			processaIdadeETempoDeContribuicao(idadeDoUsuario, tempoDeContribuicao);
		}
	}

	static void processaIdadeETempoDeContribuicao(byte idadeDoUsuario, byte tempoDeContribuicao) {
		String resultadoContribuicao = null;
		resultadoContribuicao = (idadeDoUsuario >= IDADE_MINIMA)
				&& (tempoDeContribuicao >= TEMPO_MINIMO_DE_CONTRIBUIÇÃO) ? "VOCÊ PODE SE APOSENTAR."
						: "VOCÊ NÃO TEM IDADE MINIMA DE CONTRIBUIÇÃO";
		JOptionPane.showMessageDialog(null, resultadoContribuicao);
	}

}
