package threads;

import javax.swing.JOptionPane;

public class ProcessParaleloCorrenteDuasThreadSleep {

	public static void main(String[] args) throws InterruptedException {
		
		//RotinaExecutarParaleloSleep();
		//ProcessamentoParalelo();
		ProcessamentoConcorrenteEntreDuasThread();
		
	}
	
	/*C�digo da rotina que quero executar em paralelo em um tempo de parada*/
	public static void RotinaExecutarParaleloSleep() throws InterruptedException {
		
		for (int pos = 0; pos < 10; pos++) {
			
			Thread.sleep(1000);/*D� um tempo*/
			/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
			System.out.println("Executando a Threads");
		}

		System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD");
		
	}
	
	/*Thread processando em paralelo*/
	public static void ProcessamentoParalelo() throws InterruptedException {
		
		new Thread() {
			
			public void run() {/*Executa o que n�s queremos*/
				/*C�digo da rotina*/
				for (int pos = 0; pos < 10; pos++) {
					
					/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
					System.out.println("Executando a Threads Paralelo");
					
					try {
						
						Thread.sleep(1000);/*D� um tempo*/
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				
				System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD");
				
			}
	
			
		}.start();/*Start liga a thread que fica processando paralelamente por tr�s*/
		
		/*C�digo do sistema do us�ario continua o fluxo de trabalho*/
		/*Fluxo do sistema, cadastro de venda, um emiss�o de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio/ Executando por tr�s dos panos");
		
	}
	
	/*Processamento Concorrente Entre Duas Thread*/
	public static void ProcessamentoConcorrenteEntreDuasThread() throws InterruptedException {
		
		/*Thread processamento paralelo do envio de email*/
		new Thread() {
			
			public void run() {/*Executa o que n�s queremos*/
				/*C�digo da rotina*/
				for (int pos = 0; pos < 10; pos++) {
					
					/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
					System.out.println("Executando a Threads - envio de email");
					
					try {
						
						Thread.sleep(2000);/*D� um tempo*/
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				
				System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD - EMIAL");
				
			}
			
		}.start();/*Start liga a thread que fica processando paralelamente por tr�s*/
		
		/*C�digo do sistema do us�ario continua o fluxo de trabalho*/
		/*Fluxo do sistema, cadastro de venda, um emiss�o de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio/ Executando por tr�s dos panos");
		
		
		//*********************** DIVIS�O DAS THREADS ************************//
		
		/*Thread processamento paralelo do envio de nota fiscal*/
		new Thread() {
			
			public void run() {/*Executa o que n�s queremos*/
				/*C�digo da rotina*/
				for (int pos = 0; pos < 10; pos++) {
					
					/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
					System.out.println("Executando a Threads - envio de nota fiscal");
					
					try {
						
						Thread.sleep(1000);/*D� um tempo*/
						
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				
				System.out.println("CHEGOU AO FIM DO C�DIGO DE TESTE DE THREAD - NOTA FISCAL");
				
			}
			
		}.start();/*Start liga a thread que fica processando paralelamente por tr�s*/
		
		/*C�digo do sistema do us�ario continua o fluxo de trabalho*/
		/*Fluxo do sistema, cadastro de venda, um emiss�o de nota fiscal, algo do tipo*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usu�rio/ Executando por tr�s dos panos");
	}

}
