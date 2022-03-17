
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

	static final double NOTA_MINIMA_DE_PORTUGUES = 60;
	static final double NOTA_MINIMA_DE_MATEMATICA = 60;
	static final double NOTA_MINIMA_DO_TOTAL = 150;
	
	public static void main(String[] args) {

		double notaDePortugues = perguntaNotaDePortugues();
		double notaDeMatematica = perguntaNotadeDeMatematica();
		boolean obteveNotaMinimaPorMateria = validaNotaMinimaPorMateria(notaDePortugues, notaDeMatematica);
		double somaTotalDasNotas = somaTotalDasNotas(notaDeMatematica, notaDePortugues);
		boolean obteveMinimaTotal = validaMinimaTotal(somaTotalDasNotas);
		boolean obteveNotasSuficientes = validaNotasSuficientes(obteveNotaMinimaPorMateria, obteveMinimaTotal);
		exibeResultado(notaDePortugues, notaDeMatematica, obteveNotasSuficientes, somaTotalDasNotas);
	}
	
	static double perguntaNotaDePortugues () {
		return Double.parseDouble(JOptionPane.showInputDialog("CALCULE SUAS NOTAS DE PORTUGU�S E MATEMATICA \n\n\nDIGITE SUA NOTA DE PORTUGU�S:"));
	}
	
	static double perguntaNotadeDeMatematica() {
		return Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA NOTA DE MATEMATICA:"));
	}
	
	static double somaTotalDasNotas(double notaDePortugues, double notaDeMatematica) {
		return notaDeMatematica +  notaDePortugues;
	}
	
	static boolean validaNotaMinimaPorMateria(double notaDePortugues, double notaDeMatematica) {
		return notaDePortugues >= NOTA_MINIMA_DE_PORTUGUES || notaDeMatematica >= NOTA_MINIMA_DE_MATEMATICA;
	}
	
	static boolean validaMinimaTotal(double somaTotal) {
		return somaTotal >= NOTA_MINIMA_DO_TOTAL;
	}
	
	static boolean validaNotasSuficientes (boolean obteveNotaMinimaPorMateria, boolean obteveMinimaTotal) {
		return obteveMinimaTotal && obteveNotaMinimaPorMateria;
	}

	static void exibeResultado (double notaDePortugues, double notaDeMatematica, boolean obteveNotasSuficientes, double somaTotal) {
		
		if (obteveNotasSuficientes) {			
				JOptionPane.showMessageDialog(null,"PARABÉNS VOCÊ PONTUOU " + somaTotal +". ESTÁ APROVADO!");
		} else {
				JOptionPane.showMessageDialog(null, "INFELIZMENTE VOCÊ NÃO ATINGIU A NOTA MINIMA PARA SER APROVADO.");
		}
	}
}
