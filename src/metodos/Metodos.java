package metodos;

//M�TODO -> � UM GRUPO DE C�DIGO QUE FAZ UMA DETERMINADA OPERA��O.
//REAPROVEITAMENTO DE C�DIGO (VALIDAR CPF).
//METODO -> (VOID) ELE N�O TEM VALOR. ELE DEFINE QUE O METODO N�O TERA RETORNO.
//METODO -> (INT) TEM RETORNO, CONSEGUE CAPTURA O RESULTADO E FAZER MAIS CALCULOS.

public class Metodos {

	public static void main(String[] args) {
		
		//meuMetodo(); <- //PARA EXECULTA OS METODOS TEM QUE CHAMA NO METODO PRINCIPAL (MAIN)
		int resultado;
		resultado = multiplicar(5,5);
		System.out.println(resultado + 5);
	}

	public static void meuMetodo(){
		
		//CORPO DO METODO
		System.out.println("Esse � meu metodo");
	}
	
	public static int multiplicar(int numero1, int numero2){
		int resultado = 0;
		
		resultado = numero1 - numero2;
		return resultado;
		
		
	}
}
