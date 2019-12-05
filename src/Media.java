import javax.swing.JOptionPane;


public class Media {
	
	public static void main(String[] args){
		int m, pt, pe, ad, np;
		
		pt =Integer.parseInt(JOptionPane.showInputDialog("Portfólio: "));
		pe =Integer.parseInt(JOptionPane.showInputDialog("Prova eletronica: "));
		ad =Integer.parseInt(JOptionPane.showInputDialog("Avaliação dissertativa: "));
		np =Integer.parseInt(JOptionPane.showInputDialog("Nota do professor: "));
		
		m = (pt*2 + pe*3 + ad*3 + np*2)/10;
		
		if( m >= 6 ){
			JOptionPane.showMessageDialog(null,"Aprovado: " + m);
		} else{
			JOptionPane.showMessageDialog(null,"Reprovado: " + m);
		}
			
		}

}
