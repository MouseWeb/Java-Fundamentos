import javax.swing.JOptionPane;
public class Calcular {
	
	public static void main(String[] args){
		int valor1,valor2,soma,sub,mult,div, modulo;
		
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
		
		soma = valor1 + valor2;
		sub = valor1 - valor2;
		mult = valor1 * valor2;
		div = valor1 / valor2;
		modulo = valor1 % valor2;
		
		JOptionPane.showMessageDialog(null,"Soma: " + soma + "\n Subtração: "
		+ sub + "\n Multiplicar: " + mult + "\n Divivisão: " + div + "\n Resto da Divisão: "
		+ modulo);	
	
	}

}
