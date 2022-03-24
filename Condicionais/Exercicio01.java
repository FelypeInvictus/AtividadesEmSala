import javax.swing.JOptionPane;

public class Exercicio01 {

	/*
	 * * Crie um programa que vai receber as notas que uma pessoa tirou nas duas
	 * materias de sua prova. Serão dois parâmetros para receber. um para receber a
	 * nota de português e outro para receber as de matemática. A prova, no total,
	 * vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é
	 * igual ou maior que 150. Entretanto, o candidato não pode tirar menos do que
	 * 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em
	 * português e 100 em matemática (totalizando uma nota maior do que o total
	 * necessário que é 150) ele não conseguirá a vaga. No final mostre para o
	 * candidato se ele conseguiu ou não.
	 */

	static final byte NOTA_MINIMA_DE_PORTUGUES = 60;
	static final byte NOTA_MINIMA_DE_MATEMATICA = 60;
	static final int NOTA_MINIMA_TOTAL = 150;

	public static void main(String[] args) {

		double notaDePortugues = perguntaNotaDePortugues();
		double notaDeMatematica = perguntaNotadeDeMatematica();
		boolean obteveNotaMinimaPorMateria = validaNotaMinimaPorMateria(notaDePortugues, notaDeMatematica);
		double somaTotalDasNotas = somaTotalDasNotas(notaDeMatematica, notaDePortugues);
		boolean obteveMinimaTotal = validaMinimaTotal(somaTotalDasNotas);
		exibeResultado(obteveMinimaTotal, obteveNotaMinimaPorMateria, somaTotalDasNotas);
	}

	static double perguntaNotaDePortugues() {
		try {
		return Double.parseDouble(JOptionPane.showInputDialog("CALCULE SUAS NOTAS DE PORTUGUÊS E MATEMATICA \n\n\nDIGITE SUA NOTA DE PORTUGUÊS:"));
		} catch (NumberFormatException e) {
			System.exit(0); //Caso não receber nenhum dado, o programa será encerrado
		} catch (NullPointerException e) {
			System.exit(0); //Caso o usuario cancelar, o programa será encerrado
		}

		return Double.parseDouble(JOptionPane.showInputDialog("CALCULE SUAS NOTAS DE PORTUGUÊS E MATEMATICA \n\n\nDIGITE SUA NOTA DE PORTUGU�S:"));
	}

	static double perguntaNotadeDeMatematica() {
		try {
		return Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA NOTA DE MATEMATICA:"));
		} catch (NumberFormatException e) {
			System.exit(0); //Caso não receber nenhum dado, o programa será encerrado
		} catch (NullPointerException e) {
			System.exit(0); //Caso o usuario cancelar, o programa será encerrado
		}

		return Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA NOTA DE MATEMATICA:"));

	}

	static boolean validaNotaMinimaPorMateria(double notaDePortugues, double notaDeMatematica) {
		return notaDePortugues >= NOTA_MINIMA_DE_PORTUGUES && notaDeMatematica >= NOTA_MINIMA_DE_MATEMATICA;
	}

	static double somaTotalDasNotas(double notaDePortugues, double notaDeMatematica) {
		return notaDeMatematica + notaDePortugues;
	}

	static boolean validaMinimaTotal(double somaTotal) {
		return somaTotal >= NOTA_MINIMA_TOTAL;
	}

	static void exibeResultado(boolean obteveMinimaTotal, boolean obteveNotaMinimaPorMateria, double somaTotal) {
		if (obteveMinimaTotal && obteveNotaMinimaPorMateria) {
			exibePositivo(somaTotal);
		} else {
			exibeNegativo();
		}
	}

	static void exibePositivo(double somaTotal) {
		JOptionPane.showMessageDialog(null, "PARABÉNS VOCÊ PONTUOU " + somaTotal + ". FOI APROVADO!");
	}

	static void exibeNegativo() {
		JOptionPane.showMessageDialog(null, "INFELIZMENTE VOCÊ NÃO ATINGIU A NOTA MINIMA PARA SER APROVADO.");
	}
}
