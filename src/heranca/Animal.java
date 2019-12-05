package heranca;

//ESSA CLASSE � CHAMADA DE SUPER CLASSE
//APARTI DA CLASSE (ANIMAL) CRIAMOS OS M�TODOS E ATRIBUTOS DAS CLASSES (CAO E PASSARO) QUE S�O AS SUBCLASSES.

public class Animal {
	
	private String tamanho;
	private double peso;
	private String cor;
	
	public void correr(){
		System.out.println("Animal correr"); //FRASE MAIS GENERICA.
	}
	
	public void setCor(String cor){
	//GETTER E SETTER -> S�O M�TODOS QUE S�O ULTILIZADOS PARA SETA ATRIBUTOS EM UMA CLASSE.
		this.cor = cor; // M�TODO QUE SETTER O VALOR DE UM ATRIBUTO -> (COR).
		
	}
	
	public String getCor(){
		return this.cor; //RECUPERA UM VALOR DE UM ATRIBUTO -> (COR).
	}

}