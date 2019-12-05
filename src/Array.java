import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numAlunos = 5;
		double[] notaAlunos = new double[numAlunos];
		
		for(int i = 0; i < numAlunos; i++) {
			System.out.println("insira a nota do " +(i+1)+ "ºAluno.");
			notaAlunos[i] = input.nextDouble();
		}

	}

}
