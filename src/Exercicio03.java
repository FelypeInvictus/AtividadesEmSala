import javax.swing.JOptionPane;

public class Exercicio03 {
	
	static final byte NOTA_MINIMA_PARA_SER_APROVADO = 70;
	public static void main(String[] args) {
		
		byte notaDoAluno = Byte.parseByte(JOptionPane.showInputDialog("Digite sua nota: "));
		String resultadoDoTeste = notaDoAluno >= NOTA_MINIMA_PARA_SER_APROVADO ? "Você foi aprovado. Parabéns." : "Você foi reprovado. Estude mais no proximo ano.";
		JOptionPane.showMessageDialog(null, resultadoDoTeste);
	}
	

}
