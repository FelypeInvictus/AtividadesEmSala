
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

	static final float NOTA_MINIMA_POR_MATERIA = 60;
	static final float NOTA_MINIMA_DO_TOTAL = 150;
	
	public static void main(String[] args) {

		double notaDePortugues = perguntaNotaDePortugues();
		double notaDeMatematica = perguntaNotadeDeMatematica();
		double somaTotal = somaTotalDasMaterias(notaDeMatematica, notaDePortugues);
		
		boolean validaNotaMinimaPorMateria = validaNotaMinimaPorMateria(notaDePortugues, notaDeMatematica, somaTotal);
		boolean validaMinimaTotal = validaMinimaTotal(somaTotal);
		resultado(validaNotaMinimaPorMateria, validaMinimaTotal);
		
		boolean obteveNotasSuficientes = validaNotaMinimaPorMateria(notaDePortugues, notaDeMatematica, somaTotal);
		
		
		exibeResultado(notaDePortugues, notaDeMatematica, obteveNotasSuficientes, somaTotal);

	}
	
	
	static double perguntaNotaDePortugues () {
		return Double.parseDouble(JOptionPane.showInputDialog("CALCULE SUAS NOTAS DE PORTUGUÊS E MATEMATICA \n\n\nDIGITE SUA NOTA DE PORTUGUÊS:"));
	}
	
	static double perguntaNotadeDeMatematica() {
		return Double.parseDouble(JOptionPane.showInputDialog("DIGITE SUA NOTA DE MATEMATICA:"));
		
	}
	
	static double somaTotalDasMaterias(double notaDePortugues, double notaDePortugues2) {
		return notaDePortugues2 +  notaDePortugues;
	}
	
	
	
	static boolean validaNotaMinimaPorMateria(double notaDePortugues, double notaDeMatematica,  double somaTotal) {
		 
		return notaDePortugues >= NOTA_MINIMA_POR_MATERIA || notaDeMatematica >= NOTA_MINIMA_POR_MATERIA ;

	}
	static boolean validaMinimaTotal(double somaTotal) {
		
		return somaTotal >= NOTA_MINIMA_DO_TOTAL;
	}
	
	static boolean resultado(boolean validaNotaMinimaPorMateria, boolean validaMinimaTotal) {
		return validaMinimaTotal && validaNotaMinimaPorMateria;
	}
	
	
	
	
	
	
	static void exibeResultado (double notaDePortugues, double notaDeMatematica, boolean obteveNotasSuficientes, double somaTotal) {
		
		if (obteveNotasSuficientes) {			
				JOptionPane.showMessageDialog(null,"PARABÉNS VOCÊ PONTUOU " + somaTotal +". ESTÁ APROVADO!");
		} else {
				JOptionPane.showMessageDialog(null, "INFELIZMENTE VOCÊ NÃO ATINGIU A NOTA MINIMA PARA SER APROVADO.");
		}
	}
}
