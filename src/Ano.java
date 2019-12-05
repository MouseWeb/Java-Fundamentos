import javax.swing.JOptionPane;

public class Ano {
	public static void main(String args[]){
		int ano,result;
		
		ano=Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
	
	
		
		if(ano <= 2000){

			JOptionPane.showMessageDialog(null,"Maior de idade");
			JOptionPane.showMessageDialog(null,"Pode votar");
			JOptionPane.showMessageDialog(null,"pode tirar cnh");
			
		} else {
			
			JOptionPane.showMessageDialog(null,"Menor de idade");
			
		}
			
	}
}

