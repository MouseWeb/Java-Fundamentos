import javax.swing.JOptionPane;

public class PrecoProduto {
	
	public static void main(String[] args) {

		double preco, porc = 0, novoValor = 0;
		
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço do Produto: "));

		if( preco >= 0.01 && preco <= 50.00) { 
			
			porc = (preco * 7.78)/100;
			
			novoValor = preco + porc;

		}
	
		else if( preco >= 50.01 && preco <= 100.00) {
			
			porc = (preco * 7.78)/100;
			novoValor = preco + porc;
		}

		else if( preco >= 100.01 && preco <= 150.00) {
			
			porc = (preco * 6.98)/100;
			novoValor = preco + porc;
		}
	
		else if( preco >= 150.01 && preco <= 200.00) {
			
			porc = (preco * 6.34)/100;
			novoValor = preco + porc;
		}

		else if( preco >= 200.01 && preco <= 250.00) {
			
			porc = (preco * 5.78)/100;
			novoValor = preco + porc;
		}
	
		else if( preco >= 250.01 && preco <= 300.00) {
			
			porc = (preco * 5.37)/100;
			novoValor = preco + porc;
		}

		else if( preco >= 300.01 && preco <= 350.00) {
			
			porc = (preco * 4.87)/100;
			novoValor = preco + porc;
			
		}else { 
		
			porc = (preco * 3.50)/100;
			novoValor = preco + porc;
		}
		
		JOptionPane.showMessageDialog(null, "Novo valor de venda: " + novoValor);
	}
}
