package construtores.orientacaoObjeto.entities;

// this -> servi para diferenciar o atributo do objeto do parametro do construtor.
// Palavra this:
//			� � uma refer�ncia para o pr�prio objeto
//		� Usos comuns: 	
//			� Diferenciar atributos de vari�veis locais 
//			� Passar o pr�prio objeto como argumento na chamada de um m�todo ou construtor
// this.name = name; -> | this.name | = est� acessando o objeto e | name | = � o parametro que recebe o valor na execu��o da instancia��o,
//        																												acessando a variavel local.

// Sobrecarga:
// � � um recurso que uma classe possui de oferecer mais de uma opera��o com o mesmo nome, por�m com diferentes listas de par�metros
// � sobrecarga � poder disponibiizar mais de uma vers�o da mesma opera��o, a diferen�a entre ela vai ser a lista de par�metros.

public class ProdutoEntities {

	public String name;
	public double price;
	public int quantity;
	
	// construtor padr�o -> 
	public ProdutoEntities() {
		
	}

	// sobrecarga de cosntrutor modificado 1.
	// O Construtor quando for instanciado vai atribuir os valores para os atributos do objeto.
	public ProdutoEntities(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// sobrecarga de cosntrutor modificado 2.
	public ProdutoEntities(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Sobrepondo a op��o padr�o do | to String | que j� vem na classe Object e
	// implementando a minha vers�o | toString |.
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
}
