package classes;

public class ClassesPrincipais {
	
	// OS ATRIBUTOS -> DEFINE AS CARACTERISTICAS DE UM OBJETO.
	// ATRAVEZ DESSA VARIAVEL -> (MINHACASA) CONSEGUIMOS ACESSAR OS ATRIBUTOS E M�TODOS CRIADOS NA MEMORIA QUE S�O OS -> OBJETOS.
	// M�TODOS -> DEFINE A�OES E COMPORTAMENTOS QUE UM OBJETO PODE FAZER.
	// OBJETO -> � UMA INST�NCIA DE UMA CLASSE, TENDO ATRIBUTOS E COMPORTAMENTOS.
	
	// ------------------------------------------------------------------------------------------------------------------------------
	
	/*
 		� � um tipo estruturado que pode conter (membros): 
			� Atributos (dados / campos) 
			� M�todos (fun��es / opera��es)
		� A classe tamb�m pode prover muitos outros recursos, tais como: 
			� Construtores 
			� Sobrecarga 
			� Encapsulamento 
			� Heran�a 
			� Polimorfismo
		� Exemplos: 
			� Entidades: Produto, Cliente, Triangulo 
			� Servi�os: ProdutoService, ClienteService, EmailService, StorageService 
			� Controladores: ProdutoController, ClienteController 
			� Utilit�rios: Calculadora, Compactador 
			� Outros (views, reposit�rios, gerenciadores, etc.)
	 */
	
	// ----------------------------------------------------------------------------------------------------------------------------
	
	// Boxing -> � o processo de convers�o de um objeto tipo valor para um objeto tipo refer�ncia compat�vel
	//         Exemplo: int x = 20; -> vari�vel local X recebe 20, est� alocada na �rea de m�moria STACK.
	//         			Object obj = x; -> a vari�vel OBJ � do tipo Object.class, OBJ � uma refer�ncia por que o tipo � class,
	//                  					vai ser alocado o valor de X que vale 20 para �rea de m�moria HEAP.
	//     Obs: esse processo � chamado de Boxing -> a tradu��o � encaixotamento, pegamos um tipo valor comum e encaxotamos ele no tipo objeto.
	
	// Unboxing -> � o processo de convers�o de um objeto tipo refer�ncia para um objeto tipo valor compat�vel
	//				int x = 20;
	//				Object obj = x;
	//		   Exemplo: int y = (int) obj; -> vai ser cliado no STACK uma �rea na m�moria contendo o valor de X = 20.
	
	// Wrapper classes:
	//		� S�o classes equivalentes aos tipos primitivos
	//		� Boxinge unboxing� natural na linguagem
	//	� Uso comum: campos de entidades em sistemas de informa��o (IMPORTANTE!)
	//		� Pois tipos refer�ncia (classes) aceitam valor nulle usufruem dos recursos OO
	// 	� O tipo Wrapper classes aceita NULL, � do tipo class -> | Double, Interger, Boolean, Character, Byte, Shot, Long e Float |.
	//		- Wrapper classes � quando a primeira letra do tipo � mai�scula.
	//  � Tipos primitivos n�o aceita o valor NULL.
	// OBS: colocar sempre do -> (y) |  tipo class     | para que possa aceita o valor NULL e poder gravar no banco de dados NULL.
	//                     	  -> (n) |  tipo primitivo | n�o aceita valor NULL.
	
	public static void main(String[] args) {
		
		int x = 20;
		
		// Tipo refer�ncia -> Boxing
		Object obj = x;
		
		System.out.println(obj);
		
		// Tipo valor -> Unboxing
		int y = (int) obj;
		
		System.out.println(obj);
		
		// -------------------------------------------------------------------------------------------------------------------------------------
	
		Casa minhaCasa = new Casa(); //INST�NCIA A CLASS (CASA.JAVA) COM A VARIAVEL (MINHACACA) E CRIA UMA NOVA CASA NA MEMORIA QUE � O OBJETO.
		minhaCasa.cor = "Azul"; //CHAMA O M�TODO DA OUTRA CLASS (COR).
		minhaCasa.modelo = "Gol";
		
		System.out.println(minhaCasa.cor);
		
		minhaCasa.abrirGaragem(); //CHAMA O M�TODO DA OUTRA CLASS (ABRIGARAGEM).

	}

}

