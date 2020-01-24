package threads;

public class ThreadObjetoRunnable {

	// Threads manipulaveis 
	public static void main(String[] args) throws InterruptedException {
		
		ThreadObjeto();
	}
	
	/*Processamento Concorrente Entre Duas Thread*/
	public static void ThreadObjeto() throws InterruptedException {
		
		/*Thread processamento paralelo do envio de email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
				
		
		/*Thread processamento paralelo do envio de nota fiscal*/
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD");
			
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			/*Código da rotina*/
			for (int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando a Threads - envio de email");
				
				try {
					
					Thread.sleep(2000);/*Dá um tempo*/
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			
			System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD - EMIAL");
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		@Override
		public void run() {
			
			/*Código da rotina*/
			for (int pos = 0; pos < 10; pos++) {
				
				/*Quero executar esse envio a com um tempo de parada, ou com um tempo determinado*/
				System.out.println("Executando a Threads - envio de nota fiscal");
				
				try {
					
					Thread.sleep(1000);/*Dá um tempo*/
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			
			System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD - NOTA FISCAL");
		}
	};
	
}
