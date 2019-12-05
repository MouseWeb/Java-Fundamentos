package encapsulamento.entities;

// Encapsulamento:
//		� � um princ�pio que consiste em esconder detalhes de implementa��o de uma classe, 
//			expondo apenas opera��es seguras e que mantenham os objetos em um estado consistente.
//		� Regra de ouro: 
//			o objeto deve sempre estar em um estado consistente, e a pr�pria classe deve garantir isso.
// Regra geral b�sica
//		� Um objeto N�O deve expor nenhum atributo (modificador de acesso private)
//		� Os atributos devem ser acessados por meio de m�todos gete set 

// -------------------------------------------------------------------------------------------------------------------------------------

// this -> servi para diferenciar o atributo do objeto do parametro do construtor.
// Palavra this:
//			� � uma refer�ncia para o pr�prio objeto
//		� Usos comuns: 	
//			� Diferenciar atributos de vari�veis locais 
//			� Passar o pr�prio objeto como argumento na chamada de um m�todo ou construtor
// this.name = name; -> | this.name | = est� acessando o objeto e | name | = � o parametro que recebe o valor na execu��o da instancia��o,
//        																												acessando a variavel local.

// -------------------------------------------------------------------------------------------------------------------------------------

// Sobrecarga:
// 		� � um recurso que uma classe possui de oferecer mais de uma opera��o com o mesmo nome, por�m com diferentes listas de par�metros
// 		� sobrecarga � poder disponibiizar mais de uma vers�o da mesma opera��o, a diferen�a entre ela vai ser a lista de par�metros.

public class ProdutoEntities {

	private String name;
	private double price;
	private int quantity;
	
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
	
	// Encapsulamento SET
	public void setName(String name) {
		this.name = name;
	}

	// Encapsulamento GET
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
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
}
