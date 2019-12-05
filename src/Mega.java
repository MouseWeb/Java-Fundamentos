import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mega {

	// Calcula as chances de se acertar na mega-sena a partir da
	// Informação de um número máximo e o número de acertos.

	public static void main(String args[]) throws IOException {

		// Entrada dos dados atravez do prompt
		InputStreamReader e = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(e);

		Mega ms = new Mega();

		int num1;
		int num2;

		System.out.print("Digite o numero de chances para ganhar na mega-sena: ");
		num1 = Integer.parseInt(b.readLine());

		System.out.print("Digite o numero de acertos: ");
		num2 = Integer.parseInt(b.readLine());

		System.out.print("Chances de ganhar na mega-sena: " + ms.calculo(num1, num2));

	}

	private int calculo(int num1, int num2) {

		int max = num1;
		int armazena = 1;

		for (int i = 0; i < num2; i++) {

			armazena *= (double) (max - i) / (1 + i);
			System.out.println("\n" + ((max - i) + " / " + (1 + i)) + "\n");

		}

		return armazena;
	}

}