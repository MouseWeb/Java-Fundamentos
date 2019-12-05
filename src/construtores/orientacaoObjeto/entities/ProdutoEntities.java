package construtores.orientacaoObjeto.entities;

// this -> servi para diferenciar o atributo do objeto do parametro do construtor.
// Palavra this:
//			• É uma referência para o próprio objeto
//		• Usos comuns: 	
//			• Diferenciar atributos de variáveis locais 
//			• Passar o próprio objeto como argumento na chamada de um método ou construtor
// this.name = name; -> | this.name | = está acessando o objeto e | name | = é o parametro que recebe o valor na execução da instanciação,
//        																												acessando a variavel local.

// Sobrecarga:
// • É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros
// • sobrecarga é poder disponibiizar mais de uma versão da mesma operação, a diferença entre ela vai ser a lista de parâmetros.

public class ProdutoEntities {

	public String name;
	public double price;
	public int quantity;
	
	// construtor padrão -> 
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

	// Sobrepondo a opção padrão do | to String | que já vem na classe Object e
	// implementando a minha versão | toString |.
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
}
