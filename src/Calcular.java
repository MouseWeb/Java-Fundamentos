import javax.swing.JOptionPane;
public class Calcular {
	
	public static void main(String[] args){
		int valor1,valor2,soma,sub,mult,div, modulo;
		
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro n�mero"));
		
		soma = valor1 + valor2;
		sub = valor1 - valor2;
		mult = valor1 * valor2;
		div = valor1 / valor2;
		modulo = valor1 % valor2;
		
		JOptionPane.showMessageDialog(null,"Soma: " + soma + "\n Subtra��o: "
		+ sub + "\n Multiplicar: " + mult + "\n Divivis�o: " + div + "\n Resto da Divis�o: "
		+ modulo);	
	
	}

}
