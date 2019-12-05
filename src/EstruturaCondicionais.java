
public class EstruturaCondicionais {

	public static void main(String[] args) {
		
		boolean teste = true;
		int media = 6;
		
		// IF -> (SE)
		// ( ) -> (CONDIÇÃO)
		// ELSE -> (SENÃO)
		
		if( media < 6 ){
			System.out.println("REPROVADO");
		}else if( media >= 6 && media <= 8 ){ 
			System.out.println("APROVADO");
		}else if( media >= 8 ){
			System.out.println("EXCELENTE");
		}else{
			System.out.println("ERRO");
		}
		
		if( teste || false){
			System.out.println("VERDADEIRO");
		}
	
	}
}