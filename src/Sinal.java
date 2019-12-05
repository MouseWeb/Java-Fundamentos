import javax.swing.*;
public class Sinal {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		double num1,num2,conta = 0;
		String operacao = JOptionPane.showInputDialog("Digite a operacao");
		 
			if (operacao.equals("+") ) {
				
				 num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
				 num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
				
				 conta = num1 + num2;
				 
			} else if (operacao.equals("-") ) {
				
				 num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
				 num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
				
				 conta = num1 - num2;
				 
			} else if (operacao.equals("*") ) {
				
				 num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
				 num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
				
				 conta = num1 * num2;
				 
			} else if (operacao.equals("/") ) {
				
				 num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
				 num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));
				
				 conta = num1 / num2;
					 
				 } else {
					 JOptionPane.showMessageDialog(null,"Operação inválida");
					
			}
			
			JOptionPane.showMessageDialog(null, conta);
	}
}
