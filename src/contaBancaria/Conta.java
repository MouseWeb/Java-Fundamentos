package contaBancaria;

//COLOCAR O SALDO (PRIVANTE) NINGUÉM CONSEGUI ACESSAR O SALDO E COM ISSO GARANTE A INTEGRIDADE DO SALDO, NÃO É POSSIVEL ALTERAR E NEM VISUALIZAR O SALDO.
//(PUBLIC) PERMITE ACESSO NO SALDO ASSIM COMO O (DEFAULT).
//

public class Conta {
	
	//ATRIBUTOS 
	private int numeroConta;
	private double saldo = 100; // SEMPRE QUANDO NÃO COLOCAMOS MODIFICADORES DE ACESSOR ELE SE TORNA UM (DEFAULT), QUALQUER UM PODE ALTERA.
	
	protected String minhaPropriedadeProtegida; //MUITO ULTILICADO EM CLASSES DERIVADAS.
	
	//MÉTODOS
	public void depositar(double valorDepositar){
		this.saldo = this.saldo + valorDepositar; //THIS -> ELE REVERENCIA O MÉTODO, PALAVRA RESEVADA, É ULTILIZADO PARA ACESSAR ATRIBUTOS OU MÉTOS DE DETRO DA CLASSE.
		
		
	}

	public void sacar(double valorSacar){
		this.saldo = this.saldo - valorSacar; //THIS -> ELE REVERENCIA O MÉTODO, PALAVRA RESEVADA, É ULTILIZADO PARA ACESSAR ATRIBUTOS OU MÉTOS DE DETRO DA CLASSE.
		
		
	}
	
	public double retornarSaldo(){
		return this.saldo;
	}
}

