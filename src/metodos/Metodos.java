package metodos;

//MÉTODO -> É UM GRUPO DE CÓDIGO QUE FAZ UMA DETERMINADA OPERAÇÃO.
//REAPROVEITAMENTO DE CÓDIGO (VALIDAR CPF).
//METODO -> (VOID) ELE NÃO TEM VALOR. ELE DEFINE QUE O METODO NÃO TERA RETORNO.
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
		System.out.println("Esse é meu metodo");
	}
	
	public static int multiplicar(int numero1, int numero2){
		int resultado = 0;
		
		resultado = numero1 - numero2;
		return resultado;
		
		
	}
}
