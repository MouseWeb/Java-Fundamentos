//Uma determinada matéria radioativa pede metade de sua massa a cada 50 segundos. 
//Para a massa inicial de 1200 gramas, fazer um aplicativo que determine o tempo 
//necessário para que essa massa se torne menor que 0,5 gramas. Imprima no monitor 
//a massa inicial, a massa final e o tempo calculado em horas, minutos e segundos.

//Pacotes = é um método de organizar grupos de classes.

//Import = usado para importar classes de um pacote.
//JOptionPane do pacote visual Swing, a classe JOptionPane proporciona uma série de métodos estáticos que ao serem invocados criam caixas de diálogos simples e objetivas.
import javax.swing.JOptionPane;

//PUBLIC = TODOS (CLASSES) TERÃO ACESSO.
public class TempoNecessario {
	
	//PARA EXECULTA OS MÉTODOS TÊM QUE CHAMA NO METODO PRINCIPAL (MAIN).
	//METODO -> (VOID) ele não tem valor. Define que o método não terá retorno.
	public static void main(String[] args) { // É UM MÉTODO -> é um grupo de código que faz uma determinada operação.
		
		//Declaração das variáveis (int).
		int tempo = 0, aux, hora, minuto, segundo;
		//VARIAVEL= INT -> é capaz de armazenar valores entre –2147483648 até 2147483647.
		
		//Declaração das variáveis (double).
		double massa, massaFinal;
		//VARIAVEL= DOUBLE -> Números decimais.
		
		//caixas de diálogo de entrada de texto ou Input Text Dialog servem para fazer uma requisição de algum dado ao usuário de forma bem simples e direta.
		massa = Double.parseDouble(JOptionPane.showInputDialog("Digite a Massa: "));
		// A Variável (massa) recebe o valor digitado pelo usuário.
		
		// MASSAFINAL recebe o valor da MASSA.
		massaFinal = massa;
		
		// WHILE -> (ENQUANTO) ele verifica a condição primeiro pra depois executa o bloco de notas de código da chave.
		// ( ) -> (CONDIÇÃO) dentro é verificada a condição/regra de negocio.
		// Enquanto a massa for maior ou igual a 0.5 o wlhile continuará.
		while(massaFinal >= 0.5) {
			
			// MASSAFINAL recebe MASSAFINAL DIVIDIDO POR 2.
			// MASSAFINAL for maior que 0.5 o while continuará.
			massaFinal = massaFinal/2;
			
			// TEMPO recebe TEMPO e soma mais 50. 
			// Enquanto o while executa até o termino do processo o tempo vai somando mais 50 a cada passagem do while.
			tempo = tempo + 50;
			//DIVISÃO (/).
			//OPERADOR LÓGICO = (ATRIBUIÇÃO).
			//SOMAR (+).
		}
		
		// 1h é 3600 segundos, dividi pelo tempo total do while.
		hora = tempo/3600; //DIVISÃO (/) || OPERADOR LÓGICO = (ATRIBUIÇÃO).
		// aux recebe a sobra da divisão do tempo/h, para depois calcular os minutos.
		aux = tempo%3600; //MÓDULO - RESTO DA DIVISÃO (%) || OPERADOR LÓGICO = (ATRIBUIÇÃO).
		// o aux que é a sobra do tempo/h, dividi por 60 para determina os minutos.
		minuto = aux/60; 
		// o aux que é a sobra do tempo/h, pega a sobra e dividi por 60 e determina os segundos.
		segundo = aux%60; 
		
		//A caixa de diálogo de mensagem é uma caixa que serve apenas para emitir uma mensagem.
		JOptionPane.showMessageDialog(null, "Massa Inicial: " + massa 
				+ "\nMassa Final: " + massaFinal + "\nHora: " + hora 
				+ "\nMinuto: " + minuto + "\nSegundo: " + segundo);
		// OPERADOR (+) = concatena com outra variavel.
		// \n = quebra linha no java.
	}

}

