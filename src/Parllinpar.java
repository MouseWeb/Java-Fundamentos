import javax.swing.JOptionPane;

public class Parllinpar {
	
	public static void main(String[] args){
		int v1;
		
		v1 =Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		if(v1 % 2 == 0){
			JOptionPane.showMessageDialog(null,"N�mero Par: " + v1);
		}else{
			JOptionPane.showMessageDialog(null,"N�mero inpar: " + v1);
		}
	}

}
