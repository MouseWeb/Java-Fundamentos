package heranca;

//ESSA CLASSE � CHAMADA (CLASSES DERIVADAS OU SUBCLASSE).

public class Cao extends Animal{
//(EXTENDS) PALAVRA RESERVADA, (CAO) ESTENDI AS FUNCIONALIDADES DO M�TODO COMO A��ES, ATRIBUTOS (ANIMAL) -> HERAN�A.
          
	public void latir(){ // A CLASSE (CAO) -> PODE TER M�TODOS ESPECIFICOS.
		System.out.println("Cachorro Latir");
	}
	
	public void correr(){//SOBESCREVEL O M�TODO (CORRER) DA (CLASSE ANIMAL), VERIFICAR PRIMEIRO NA CLASSE CAO E IMPRIME POR QUER J� TEM O M�TODO (CORRE).
		super.correr();// (SUPER) -> CHAMA O M�TODO DA SUPER CLASSE -> (ANIMAL) E IMPRIME.
		System.out.println("como cachoro"); //FRASE INCREMENTAR
	}
	
}