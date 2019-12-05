package operadoresRelecionaisLogicos;

public class OperadoresRelecionaisLogicos {
	
	// OPERADORES -> = (ATRIBUIÇÃO)
	// OPERADORES -> == (IGUAL)
	// OPERADORES -> != (DIFERENTE)
	// OPERADORES -> > (MAIOR)
	// OPERADORES -> < (MENOR)
	// OPERADORES -> >= (MAIOR OU IGUAL)
	// OPERADORES -> <= (MENOR OU IGUAL)
	
	// OPERADORES LÓGICOS -> && (E) 
	// OPERADORES LÓGICOS -> || (OU)

	public static void main(String[] args) {
		
		boolean d1 = 2 > 3 || 4 != 5; // true
		boolean d2 = !(2>3) && 4 != 5; // true
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("--------------");
		
		boolean d3 = 10 < 5; // false
		boolean d4 = d1 || d2 && d3; // true
		
		System.out.println(d4);
		System.out.println("--------------");
		
		////////////////////////////////////////////
		
		boolean resultado;
		int numero1;
		int numero2;
		
		numero1 = 5;
		numero2 = 5;
		
		resultado = numero1 == numero2;
		
		System.out.println(resultado);
		System.out.println("--------------");
		
		///////////////////////////////////////////
		
		int a = 10;
		boolean c1 = a < 10;
		boolean c2 = a < 20;
		boolean c3 = a > 10;
		boolean c4 = a > 5;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("------------");
		
		boolean c5 = a <= 10;
		boolean c6 = a >= 10;
		boolean c7 = a == 10;
		boolean c8 = a != 10;
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
		
	}

}
