import javax.swing.JOptionPane;

public class Crescente {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		int num1,num2,num3,crescente;
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
		 
		if ((num1 > num2 && num1 > num3 && num2 > num3)) {
			JOptionPane.showMessageDialog(null,"Ordem crescente: "  + num3 + "," + num2  + ","
					+ num1);
		
		}
		
		if ((num1 > num2 && num1 > num3 && num3 > num2)) {
			JOptionPane.showMessageDialog(null,"Ordem crescente: "  + num2 + "," + num3  + ","
					+ num1);
		}
	
		if ((num2 > num1 && num2 > num3 && num1 > num3)) {
			JOptionPane.showMessageDialog(null,"Ordem crescente: "  + num3 + "," + num1  + ","
					+ num2);
		
		}
		
		if ((num2 > num1 && num2 > num3 && num3 > num1)) {
			JOptionPane.showMessageDialog(null,"Ordem crescente: "  + num1 + "," + num3  + ","
					+ num2);
		}
		
		if ((num3 > num1 && num3 > num2 && num1 > num2)) {
			JOptionPane.showMessageDialog(null,"Ordem crescente: "  + num2 + "," + num1  + ","
					+ num3);
		
		} 
		
		if ((num3 > num1 && num3 > num2 && num2 > num1)) { {
			JOptionPane.showMessageDialog(null,"Ordem crescente: "  + num1 + "," + num2  + ","
					+ num3);
		}
		
		
}
		
		
	}
}
