//Uma determinada mat�ria radioativa pede metade de sua massa a cada 50 segundos. 
//Para a massa inicial de 1200 gramas, fazer um aplicativo que determine o tempo 
//necess�rio para que essa massa se torne menor que 0,5 gramas. Imprima no monitor 
//a massa inicial, a massa final e o tempo calculado em horas, minutos e segundos.

//Pacotes = � um m�todo de organizar grupos de classes.

//Import = usado para importar classes de um pacote.
//JOptionPane do pacote visual Swing, a classe JOptionPane proporciona uma s�rie de m�todos est�ticos que ao serem invocados criam caixas de di�logos simples e objetivas.
import javax.swing.JOptionPane;

//PUBLIC = TODOS (CLASSES) TER�O ACESSO.
public class TempoNecessario {
	
	//PARA EXECULTA OS M�TODOS T�M QUE CHAMA NO METODO PRINCIPAL (MAIN).
	//METODO -> (VOID) ele n�o tem valor. Define que o m�todo n�o ter� retorno.
	public static void main(String[] args) { // � UM M�TODO -> � um grupo de c�digo que faz uma determinada opera��o.
		
		//Declara��o das vari�veis (int).
		int tempo = 0, aux, hora, minuto, segundo;
		//VARIAVEL= INT -> � capaz de armazenar valores entre �2147483648 at� 2147483647.
		
		//Declara��o das vari�veis (double).
		double massa, massaFinal;
		//VARIAVEL= DOUBLE -> N�meros decimais.
		
		//caixas de di�logo de entrada de texto ou Input Text Dialog servem para fazer uma requisi��o de algum dado ao usu�rio de forma bem simples e direta.
		massa = Double.parseDouble(JOptionPane.showInputDialog("Digite a Massa: "));
		// A Vari�vel (massa) recebe o valor digitado pelo usu�rio.
		
		// MASSAFINAL recebe o valor da MASSA.
		massaFinal = massa;
		
		// WHILE -> (ENQUANTO) ele verifica a condi��o primeiro pra depois executa o bloco de notas de c�digo da chave.
		// ( ) -> (CONDI��O) dentro � verificada a condi��o/regra de negocio.
		// Enquanto a massa for maior ou igual a 0.5 o wlhile continuar�.
		while(massaFinal >= 0.5) {
			
			// MASSAFINAL recebe MASSAFINAL DIVIDIDO POR 2.
			// MASSAFINAL for maior que 0.5 o while continuar�.
			massaFinal = massaFinal/2;
			
			// TEMPO recebe TEMPO e soma mais 50. 
			// Enquanto o while executa at� o termino do processo o tempo vai somando mais 50 a cada passagem do while.
			tempo = tempo + 50;
			//DIVIS�O (/).
			//OPERADOR L�GICO = (ATRIBUI��O).
			//SOMAR (+).
		}
		
		// 1h � 3600 segundos, dividi pelo tempo total do while.
		hora = tempo/3600; //DIVIS�O (/) || OPERADOR L�GICO = (ATRIBUI��O).
		// aux recebe a sobra da divis�o do tempo/h, para depois calcular os minutos.
		aux = tempo%3600; //M�DULO - RESTO DA DIVIS�O (%) || OPERADOR L�GICO = (ATRIBUI��O).
		// o aux que � a sobra do tempo/h, dividi por 60 para determina os minutos.
		minuto = aux/60; 
		// o aux que � a sobra do tempo/h, pega a sobra e dividi por 60 e determina os segundos.
		segundo = aux%60; 
		
		//A caixa de di�logo de mensagem � uma caixa que serve apenas para emitir uma mensagem.
		JOptionPane.showMessageDialog(null, "Massa Inicial: " + massa 
				+ "\nMassa Final: " + massaFinal + "\nHora: " + hora 
				+ "\nMinuto: " + minuto + "\nSegundo: " + segundo);
		// OPERADOR (+) = concatena com outra variavel.
		// \n = quebra linha no java.
	}

}

