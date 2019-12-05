import java.util.Scanner;

public class Circunferencia{
	
    public static void main( String[] args ){
    	
        Scanner input = new Scanner( System.in );
         
        int raio;
         
        System.out.print( "Digite o valor o raio: " );
        
        	raio = input.nextInt();
         
        System.out.printf( "O diamentro é: %d\n", ( 2 * raio ) );
        System.out.printf( "A circunferência é: %.2f\n", ( 2 * Math.PI * raio ) ); 
        System.out.printf( "A área é: %.2f\n", ( Math.PI * raio * raio ) );
    }
}


