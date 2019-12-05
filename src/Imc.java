import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		
		double peso, altura, imc;
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o Peso: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o Altura: "));
		
		imc = peso / (altura*2);
		
		if( imc <= 17 ) {
			
			JOptionPane.showMessageDialog(null, imc + " = Muito abaixo do peso ideal" );
			
		}else if( imc >= 17 && imc <= 18.49 ) {
			
			JOptionPane.showMessageDialog(null, imc + " = Abaixo do peso ideal" );
			
		}else if( imc >= 18.5 && imc <= 24.99 ) {
			
			JOptionPane.showMessageDialog(null, imc + " = Peso ideal" );
			
		}else if( imc >= 25 && imc <= 29.99 ) {
			
			JOptionPane.showMessageDialog(null, imc + " = Acima do peso ideal" );
			
		}else if( imc >= 30 && imc <= 34.99 ) {
			
			JOptionPane.showMessageDialog(null, imc + " = Obesidade" );
			
		}else if( imc >= 35 && imc <= 39.99 ) {
			
			JOptionPane.showMessageDialog(null, imc + " = Obesidade Severa" );
			
		}else {
			
			JOptionPane.showMessageDialog(null, imc + " = Obesidade Mórbida" );
			
		}
		
	}

}
