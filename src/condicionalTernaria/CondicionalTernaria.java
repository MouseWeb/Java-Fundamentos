package condicionalTernaria;

public class CondicionalTernaria {

	// ( condi��o ) ? valor_se_verdadeiro : valor_se_falso

	public static void main(String[] args) {

		//Condi��o Ten�ria
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);

		//Condi��o normal
		double p = 34.5;
		double d;
		
		if (preco < 20.0) {
			d = p * 0.1;
		} else {
			d = p * 0.05;
		}
		
		System.out.println(d);
	}

}
