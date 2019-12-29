package util;

public class testeBean {

	public static void main(String[] args) {

		//recSenhaUser();
		cpfAndCnpj("29147322000140", "05769312335");

	}
	
    public static void recSenhaUser(){
        String r = (String) GerarSenha.newPassword ();

        System.out.println(r);

    }
    
    public static void cpfAndCnpj(String dado1, String Dado2){
   
       boolean cnpj = CpfAndCnpj.isValidCNPJ(dado1);
       boolean cpf = CpfAndCnpj.isValidCPF(Dado2);
       
       System.out.println(cnpj);
       System.out.println(cpf);

    }
    
	//-----------------------------------------------------------------------------------------------------------------

	public char[] getCaracteres() {
		return caracteres;
	}

	public void setCaracteres(char[] caracteres) {
		this.caracteres = caracteres;
	}

	private char[] caracteres = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 
			'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 
			'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 
			'W', 'X', 'Y', 'Z'};
	
	
}
