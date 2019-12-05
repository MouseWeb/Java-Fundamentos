package orientacaoObjeto.entities;

//this -> servi para diferenciar o atributo do objeto do parametro do construtor.

public class ProdutoEntities {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// Sobrepondo a opção padrão do | to String | que já vem na classe Object e implementando a minha versão | toString |.
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f",totalValueInStock());
	}
}
