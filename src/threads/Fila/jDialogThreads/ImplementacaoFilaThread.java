package threads.Fila.jDialogThreads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread{

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
								new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	//public static void add(ObjetoFilaThread objetoFilaThread) {
	public void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	public void run() {
		
		System.out.println("Fila Rodando");
		
		while(true) {
			
			Iterator<ObjetoFilaThread> iteracao = pilha_fila.iterator();
		
			synchronized (iteracao) {/*Bloquear o acesso a esta lista por outros processos*/
				while (iteracao.hasNext()) { /*Enquanto conter dados na lista irá processar*/
					
					ObjetoFilaThread processar = iteracao.next();/*Pega o objeto atual*/
					
					/*Processar 10 mil notas fiscal, gerar uma lista enorme de pdf, gerar um envio em massa de email*/
					System.out.println("--------------------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());
					
					iteracao.remove();
					
					try {
						Thread.sleep(100);/*Dar um tempo pra descarga de memoria*/
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		
			try {
				Thread.sleep(1000);/*Processou toda a lista dá um tempo pra limpesa de memoria*/
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		}
		
	}
	
}
