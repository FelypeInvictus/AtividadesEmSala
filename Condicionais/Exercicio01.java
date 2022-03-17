
import javax.swing.JOptionPane;

public class Exercicio01 {
	
	/*
	 * * Crie um programa que vai receber as notas que uma pessoa tirou nas duas
	 * materias de sua prova. Ser�o dois par�metros para receber. um para receber a
	 * nota de portugu�s e outro para receber as de matem�tica. A prova, no total,
	 * vale 200 pontos - 100 para cada mat�ria. A nota m�nima total para passar �
	 * igual ou maior que 150. Entretanto, o candidato n�o pode tirar menos do que
	 * 60 pontos em qualquer uma das duas mat�rias, ou seja, se tirar 59 em
	 * portugu�s e 100 em matem�tica (totalizando uma nota maior do que o total
	 * necess�rio que � 150) ele n�o conseguir� a vaga. No final mostre para o
	 * candidato se ele conseguiu ou n�o.
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
		return Double.parseDouble(JOptionPane.showInputDialog("CALCULE SUAS NOTAS DE PORTUGU�S E MATEMATICA \n\n\nDIGITE SUA NOTA DE PORTUGU�S:"));
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
				JOptionPane.showMessageDialog(null,"PARAB�NS VOC� PONTUOU " + somaTotal +". EST� APROVADO!");
		} else {
				JOptionPane.showMessageDialog(null, "INFELIZMENTE VOC� N�O ATINGIU A NOTA MINIMA PARA SER APROVADO.");
		}
	}
}
