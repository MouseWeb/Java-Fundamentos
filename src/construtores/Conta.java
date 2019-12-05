package construtores;

public class Conta {
	
	private int numeroConta;
	private double saldo;
	
	// DENTRO DA CHAVES DEFINIMOS O QUER O CONSTRUTOR FAZ.
	public Conta( int nConta){ //PODE SE PASSA UM PARAMETRO PARA O CONSTRUTOR (int nConta).
		// CORPO
		System.out.println("Construtor invocado");
		
		// INICIALICAR A CONTA 
		this.numeroConta = nConta;
	}
	
	public void imprime(){
		
		System.out.println(numeroConta);
	}

}