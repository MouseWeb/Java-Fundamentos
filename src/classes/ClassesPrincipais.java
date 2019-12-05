package classes;

public class ClassesPrincipais {
	
	// OS ATRIBUTOS -> DEFINE AS CARACTERISTICAS DE UM OBJETO.
	// ATRAVEZ DESSA VARIAVEL -> (MINHACASA) CONSEGUIMOS ACESSAR OS ATRIBUTOS E MÉTODOS CRIADOS NA MEMORIA QUE SÃO OS -> OBJETOS.
	// MÉTODOS -> DEFINE AÇOES E COMPORTAMENTOS QUE UM OBJETO PODE FAZER.
	// OBJETO -> É UMA INSTÂNCIA DE UMA CLASSE, TENDO ATRIBUTOS E COMPORTAMENTOS.
	
	// ------------------------------------------------------------------------------------------------------------------------------
	
	/*
 		• É um tipo estruturado que pode conter (membros): 
			• Atributos (dados / campos) 
			• Métodos (funções / operações)
		• A classe também pode prover muitos outros recursos, tais como: 
			• Construtores 
			• Sobrecarga 
			• Encapsulamento 
			• Herança 
			• Polimorfismo
		• Exemplos: 
			• Entidades: Produto, Cliente, Triangulo 
			• Serviços: ProdutoService, ClienteService, EmailService, StorageService 
			• Controladores: ProdutoController, ClienteController 
			• Utilitários: Calculadora, Compactador 
			• Outros (views, repositórios, gerenciadores, etc.)
	 */
	
	// ----------------------------------------------------------------------------------------------------------------------------
	
	// Boxing -> É o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível
	//         Exemplo: int x = 20; -> variável local X recebe 20, está alocada na área de mémoria STACK.
	//         			Object obj = x; -> a variável OBJ é do tipo Object.class, OBJ é uma referência por que o tipo é class,
	//                  					vai ser alocado o valor de X que vale 20 para área de mémoria HEAP.
	//     Obs: esse processo é chamado de Boxing -> a tradução é encaixotamento, pegamos um tipo valor comum e encaxotamos ele no tipo objeto.
	
	// Unboxing -> É o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
	//				int x = 20;
	//				Object obj = x;
	//		   Exemplo: int y = (int) obj; -> vai ser cliado no STACK uma área na mémoria contendo o valor de X = 20.
	
	// Wrapper classes:
	//		• São classes equivalentes aos tipos primitivos
	//		• Boxinge unboxingé natural na linguagem
	//	• Uso comum: campos de entidades em sistemas de informação (IMPORTANTE!)
	//		• Pois tipos referência (classes) aceitam valor nulle usufruem dos recursos OO
	// 	• O tipo Wrapper classes aceita NULL, é do tipo class -> | Double, Interger, Boolean, Character, Byte, Shot, Long e Float |.
	//		- Wrapper classes é quando a primeira letra do tipo é maiúscula.
	//  • Tipos primitivos não aceita o valor NULL.
	// OBS: colocar sempre do -> (y) |  tipo class     | para que possa aceita o valor NULL e poder gravar no banco de dados NULL.
	//                     	  -> (n) |  tipo primitivo | não aceita valor NULL.
	
	public static void main(String[] args) {
		
		int x = 20;
		
		// Tipo referência -> Boxing
		Object obj = x;
		
		System.out.println(obj);
		
		// Tipo valor -> Unboxing
		int y = (int) obj;
		
		System.out.println(obj);
		
		// -------------------------------------------------------------------------------------------------------------------------------------
	
		Casa minhaCasa = new Casa(); //INSTÂNCIA A CLASS (CASA.JAVA) COM A VARIAVEL (MINHACACA) E CRIA UMA NOVA CASA NA MEMORIA QUE É O OBJETO.
		minhaCasa.cor = "Azul"; //CHAMA O MÉTODO DA OUTRA CLASS (COR).
		minhaCasa.modelo = "Gol";
		
		System.out.println(minhaCasa.cor);
		
		minhaCasa.abrirGaragem(); //CHAMA O MÉTODO DA OUTRA CLASS (ABRIGARAGEM).

	}

}

