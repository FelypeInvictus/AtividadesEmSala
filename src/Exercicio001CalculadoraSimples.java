import javax.swing.JOptionPane;

public class Exercicio001CalculadoraSimples {

	
	public static void main(String[] args) {
		
		
		double numero1 = pedirPrimeiroNumero();
		int operador = escolhaOperador();
		double numero2 = pedirSegundoNumero();
		
		MostraResultado(numero1,operador,numero2);
		
		

	}
	
	private static double pedirPrimeiroNumero () {
		//CORRIGIR ERRO: java.lang.NumberFormatException
		double numero1 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO: "));
		return numero1;
		
	}
	
	private static double pedirSegundoNumero() {
		//CORRIGIR ERRO: java.lang.NumberFormatException
		
		double numero2 = Integer.parseInt(JOptionPane.showInputDialog("DIGITE OUTRO NUMERO INTEIRO: "));
		return numero2;
	}
	
	private static double multiplicacao(double numero1, double numero2) {
		return (numero1 * numero2);
	}
	
	private static double divisao(double numero1, double numero2) {
		return (numero1 / numero2);
	}
	
	private static double adicao(double numero1, double numero2) {
		return (numero1 + numero2);
	}
	
	private static double modulo (double numero1, double numero2) {
		return (numero1 % numero2);
	}
	
	private static double subtracao(double numero1, double numero2) {
		return (numero1 - numero2);
	}

	private static int escolhaOperador() {
		
		//CORRIGIR ERRO: java.lang.NumberFormatException
		int operador = Integer.parseInt(JOptionPane.showInputDialog(null, "DIGITE O OPERADOR SENDO: \n\n\n \t(1) MULTIPLICA��O \t        (2) DIVIS�O \n (3) ADI��O \t                        (4) SUBTRA��O \n\t (5) MODULO\n"));
		return operador;
			

		
	}
	private static void MostraResultado(double numero1, int operador, double numero2) {
	
		switch (operador) {
		case 1:
			JOptionPane.showMessageDialog(null, "O RESULTADO � : "+multiplicacao(numero1, numero2));
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "O RESULTADO � : "+divisao(numero1, numero2));
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "O RESULTADO � : "+adicao(numero1, numero2));
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "O RESULTADO � : "+subtracao(numero1, numero2));
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "O RESULTADO � : "+modulo(numero1, numero2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "DIGITE UM NUMERO V�LIDO!");
			break;
		}
	}
	
	
	
	

}
