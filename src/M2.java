import javax.swing.JOptionPane;

public class M2 {

	public static void main(String[] args){
		double m2, n1, n2;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Prova Dissertativa: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Prova eletronica: "));
		
		m2 = (n1 + n2)/2;
		
		if( m2 >= 6 && m2 <= 10 ){
			JOptionPane.showMessageDialog(null,"Aprovado: " + m2);
		} else if( m2 <= 3 && m2 >= 0){
			JOptionPane.showMessageDialog(null,"Reprovado: " + m2);
		} else{
			JOptionPane.showMessageDialog(null,"Recuperação: " + m2);
		}
			
		}

}
