package util;

/**
 * Retorna o(s) numDig Dígitos de Controle Módulo 11 do
 * dado, limitando o Valor de Multiplicação em limMult,
 * multiplicando a soma por 10, se indicado:
 *
 *    Números Comuns:   numDig:   limMult:   x10:
 *      CPF                2         12      true
 *      CNPJ               2          9      true
 *      PIS,C/C,Age        1          9      true
 *      RG SSP-SP          1          9      false
 *
 * @version                V5.0 - 
 * @author                 
 * @param  String  dado    String dado contendo o número (sem o DV)
 * @param  int     numDig  Número de dígitos a calcular
 * @param  int     limMult Limite de multiplicação 
 * @param  boolean x10     Se true multiplica soma por 10
 * @return String          Dígitos calculados
 */

public class CalculoModulo11 {

	public static void main(String[] args) {
		//String value = CalculoModulo11.calculaDigitoMod11("49323389", 1, 9, false);
		String value = calculaDigitoMod11("49323389", 1, 9, false);

		System.out.println( value );

	}
	
	public static String calculaDigitoMod11(String dado, int numDig, int limMult, boolean x10) {

	    int mult, soma, i, n, dig;
	    
	    if(!x10) numDig = 1;
	    for(n=1; n<=numDig; n++){
	        soma = 0;
	        mult = 2;
	        for(i=dado.length() - 1; i >= 0; i--){
	            soma += (mult * Integer.parseInt(dado.substring(i, i + 1)));
	            if(++mult > limMult) mult = 2;
	        }
	        if(x10){
	            dig = ((soma * 10) % 11) % 10;
	        } else {
	            dig = soma % 11;
	        }
	        if(dig == 10){
	        	dado += "X";
	        } else {
	        	dado += String.valueOf(dig);
	        }
	    }
	    return dado.substring(dado.length() - numDig, dado.length());
	}


}
