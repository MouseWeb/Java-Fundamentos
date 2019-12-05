
public class Variaveis {

		// ESTRUTURA DE VARIAVEIS 
		// PARA DECLARA UMA VARIAVLE TEM QUE DA O <TIPO> E <NOME>
		// TIVER MAIS DE UMA PALAVRA NA VARIAL A PRIMEIRA LETRA DA PRIMEIRA PALAVRA MENUSCULA AS DEMAIS PALAVRAS NA MESMA VAIAVEL COM A LETRA MAIUSCULA.
		
		// TIPOS - VARIAVEL= BYTE -> NÚMEROS - 1,2,3 ATÉ 128.
		// TIPOS - VARIAVEL= INT -> NÚMEROS - 1000, 23003, 2, 1
		// TIPOS - VARIAVEL= LONG -> NÚMEROS - 100000000000, 2, 1 
		
		// TIPOS - VARIAVEL= FLOAT -> NÚMEROS DECIMAIS - 1.2343, 2.525
		// TIPOS - VARIAVEL= DOUBLE -> NÚMEROS DECIMAIS - 1.23535235, 3.52368541
		
		// TIPOS - VARIAVEL= BOOLEAN -> VALORES BOOLEANOS - TRUE / FALSE
		// TIPOS - VARIAVEL= STRING -> TEXTOS - "DOUGLAS", "CAFÉ, "DOUGLAS COELHO"
		
		
		public static void main(String[] args) {
			
			byte minhaVariavelByte;
			int minhaVariavelInt;
			long minhaVariavelLong;
			
			float minhaVariavelFloat;
			double minhaVariavelDouble;
			
			boolean minhaVariavelBoolean;
			String minhaVariavelString;
			
			minhaVariavelByte = 10*10;
			minhaVariavelInt = 10+10;
			minhaVariavelLong = 10+30;
			minhaVariavelFloat = 1.5f; // TODA VARIAVEL FLOAT TEM QUE COLOCAR A LETRA (f) DEPOIS DO NUMERO DECIMAL
			minhaVariavelDouble = 1.5555;
			minhaVariavelBoolean = true;
			minhaVariavelString = "DOUGLAS COELHO ";
			
			System.out.println(minhaVariavelByte);
			System.out.println(minhaVariavelInt);
			System.out.println(minhaVariavelLong);
			System.out.println(minhaVariavelFloat);
			System.out.println(minhaVariavelDouble);
			System.out.println(minhaVariavelBoolean);
			System.out.println(minhaVariavelString + minhaVariavelFloat); // OPERADOR (+) CONCATENA COM OUTRA VARIAVEL
		
		}

	}

	// Valores de Armazenamento Variáveis
	// A capacidade de armazenamento de cada um dos tipos é diferente.

	// byte: é capaz de armazenar valores entre -128 até 127.
	// short: é capaz de armazenar valores entre – 32768 até 32767.
	// int: é capaz de armazenar valores entre –2147483648 até 2147483647.
	// long: é capaz de armazenar valores entre –9223372036854775808 até 9223372036854775807.
	// float: é capaz de armazenar valores entre 3.4e–038 até 3.4e+038
	// double: é capaz de armazenar valores entre 1 .7e–308 até 1.7e+308
