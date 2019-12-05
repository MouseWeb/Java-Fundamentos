import javax.swing.JOptionPane;

public class Parllinpar {
	
	public static void main(String[] args){
		int v1;
		
		v1 =Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		if(v1 % 2 == 0){
			JOptionPane.showMessageDialog(null,"Número Par: " + v1);
		}else{
			JOptionPane.showMessageDialog(null,"Número inpar: " + v1);
		}
	}

}
