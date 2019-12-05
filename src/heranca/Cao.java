package heranca;

//ESSA CLASSE É CHAMADA (CLASSES DERIVADAS OU SUBCLASSE).

public class Cao extends Animal{
//(EXTENDS) PALAVRA RESERVADA, (CAO) ESTENDI AS FUNCIONALIDADES DO MÉTODO COMO AÇÕES, ATRIBUTOS (ANIMAL) -> HERANÇA.
          
	public void latir(){ // A CLASSE (CAO) -> PODE TER MÉTODOS ESPECIFICOS.
		System.out.println("Cachorro Latir");
	}
	
	public void correr(){//SOBESCREVEL O MÉTODO (CORRER) DA (CLASSE ANIMAL), VERIFICAR PRIMEIRO NA CLASSE CAO E IMPRIME POR QUER JÁ TEM O MÉTODO (CORRE).
		super.correr();// (SUPER) -> CHAMA O MÉTODO DA SUPER CLASSE -> (ANIMAL) E IMPRIME.
		System.out.println("como cachoro"); //FRASE INCREMENTAR
	}
	
}