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
	
	// Sobrepondo a op��o padr�o do | to String | que j� vem na classe Object e implementando a minha vers�o | toString |.
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
