import java.util.Scanner;

public class Circunferencia{
	
    public static void main( String[] args ){
    	
        Scanner input = new Scanner( System.in );
         
        int raio;
         
        System.out.print( "Digite o valor o raio: " );
        
        	raio = input.nextInt();
         
        System.out.printf( "O diamentro �: %d\n", ( 2 * raio ) );
        System.out.printf( "A circunfer�ncia �: %.2f\n", ( 2 * Math.PI * raio ) ); 
        System.out.printf( "A �rea �: %.2f\n", ( Math.PI * raio * raio ) );
    }
}


