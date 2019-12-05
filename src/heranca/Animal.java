package heranca;

//ESSA CLASSE É CHAMADA DE SUPER CLASSE
//APARTI DA CLASSE (ANIMAL) CRIAMOS OS MÉTODOS E ATRIBUTOS DAS CLASSES (CAO E PASSARO) QUE SÃO AS SUBCLASSES.

public class Animal {
	
	private String tamanho;
	private double peso;
	private String cor;
	
	public void correr(){
		System.out.println("Animal correr"); //FRASE MAIS GENERICA.
	}
	
	public void setCor(String cor){
	//GETTER E SETTER -> SÃO MÉTODOS QUE SÃO ULTILIZADOS PARA SETA ATRIBUTOS EM UMA CLASSE.
		this.cor = cor; // MÉTODO QUE SETTER O VALOR DE UM ATRIBUTO -> (COR).
		
	}
	
	public String getCor(){
		return this.cor; //RECUPERA UM VALOR DE UM ATRIBUTO -> (COR).
	}

}