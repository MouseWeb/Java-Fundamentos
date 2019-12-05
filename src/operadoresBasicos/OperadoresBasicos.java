package operadoresBasicos;

public class OperadoresBasicos {
	
	//SOMAR (+)
	//SUBTRAIR (-)
	//MULTIPLICAÇÃO (*)
	//DIVISÃO (/)
	//MÓDULO - RESTO DA DIVISÃO (%)

	public static void main(String[] args) {
		
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = 10.0 / 8.0;
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);
		System.out.println("-------------");
		
		/////////////////////////////////////////////////////////////
		
		int primeiro = 10;
		int segundo = 8;
		int resultado;
		
		resultado = primeiro + segundo;
		System.out.println(resultado);
		System.out.println("-------------");
		
		
		/////////////////////////////////////////////////////////////
		
		double n6 = 10;
		double n7 = 30;
		
		String s = "ABC";
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(s);
		System.out.println("-------------");
		
		n1 *= 2;
		n2 += n6;
		s += "DEF";
		
		System.out.println(n6);
		System.out.println(n7);
		System.out.println(s);
		
	}

}
