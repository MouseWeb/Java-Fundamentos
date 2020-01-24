import javax.swing.JOptionPane;

public class Sigla {

	public static void main(String[] args) {
		// TODO Auto-generated method
		
		String operacao = JOptionPane.showInputDialog("Digite a sigla de um estado do sudeste em mai�sculo");
		 
			if (operacao.equals("ES") ) {
				operacao = "Espirito Santo";
				
			} else if (operacao.equals("MG") ) {
				operacao = "Minas Gerais";
				
			} else if (operacao.equals("RJ") ) {
				operacao = "Rio de Janeiro";
			
			} else if (operacao.equals("SP") ) {
				operacao = "S�o Paulo";
							 
		    } else {
				operacao = "Sigla Inv�lida";
				 		
			}
			
			JOptionPane.showMessageDialog(null,operacao);	
			
	}
}
