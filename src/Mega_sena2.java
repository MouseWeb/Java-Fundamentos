import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 * Programa Java simula o sorteio e aposta da Mega Sena.
 * O programa sorteia seis números randomicos, sem repetição. O usuário entra com seis números
 * de sua aposta. Por fim o programa avalia quantos acertos o usuário obteve!
 *
 * Objetivos:
 * - exercício de lógica.
 * - usar a entrada de dados via teclado.
 * - uso de funções para organizar o código.
 * - uso dos comandos de repetição for e do while.
 * - uso da API do Java para geração de números randômicos.
 *
 */

public class Mega_sena2 {

	static int NUMERO_DEZENAS = 6;

	// inicializei a variável que vai receber os resultados
	static String sorteioComputador = "12345678963846498561896518965498619"
			+ "64984964985649865498658946598469846548548965984561348694651348952148965";
	static String apostaUsuario = "2305480516130000132";

	public static void main(String[] args) {

		// Scanner teclado = new Scanner(System.in);

		int[] sorteio = sorteaSena();
		int[] aposta = new int[NUMERO_DEZENAS];

		// trecho processa a aposta
		// System.out.println("Faça sua aposta: ");
		JOptionPane.showMessageDialog(null, "Autor: Douglas Coelho \n\n Faça sua aposta.", "Simulador Da Mega-Sena",
				JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i < NUMERO_DEZENAS; i++) {

			int nroAposta;
			boolean repetido = false;

			do {
				// System.out.print("Informe a dezena " + (i + 1) + ": ");
				// JOptionPane.showInputDialog(null, "Informe a dezena " + (i +
				// 1)
				// + ": ", "Simulador Da Mega Sena",
				// JOptionPane.PLAIN_MESSAGE);

				// nroAposta = teclado.nextInt();
				nroAposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a dezena " + (i + 1) + ": ",
						"Simulador Da Mega Sena", JOptionPane.PLAIN_MESSAGE));

				// Se o numero digitado for igual ou menor que zero
				// retorna nada.
				if (nroAposta <= 0) {

					// System.out.println("Número inválido, aposta cancelada!");
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Número inválido, aposta cancelada!", "Simulador Da Mega Sena",
							JOptionPane.ERROR_MESSAGE);
					return;

					// Se o número digitado for maior que 60
					// retorna nada
				} else if (nroAposta > 60) {

					// System.out.println("Número inválido, aposta cancelada!");
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Número inválido, aposta cancelada!", "Simulador Da Mega Sena",
							JOptionPane.ERROR_MESSAGE);
					return;

				}

				repetido = existeNumero(aposta, nroAposta);

				if (repetido) {

					// System.out.println("Ops, número repetido!");
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showMessageDialog(null, "Ops, número repetido!", "Simulador Da Mega Sena",
							JOptionPane.ERROR_MESSAGE);
				}
			} while (repetido); // evita repetição de número
			aposta[i] = nroAposta;
		}

		for (int i = 0; i < aposta.length; i++) {

			// System.out.print(aposta[i] + " ");
			// JOptionPane.showMessageDialog(null, "Sua aposta foi: " +
			// aposta[i]
			// + "\n ", "Simulador Da Mega Sena",
			// JOptionPane.INFORMATION_MESSAGE);

			apostaUsuario = "Aposta do usuário: " + " \n" + aposta[0] + " \n" + aposta[1] + " \n" + aposta[2] + " \n"
					+ aposta[3] + " \n" + aposta[4] + " \n" + aposta[5];
		}

		for (int i = 0; i < sorteio.length; i++) {

			// System.out.print(sorteio[i] + " ");
			// JOptionPane.showMessageDialog(null,
			// "Os números sorteados foram: "
			// + sorteio[i] + " \n", "Simulador Da Mega Sena",
			// JOptionPane.INFORMATION_MESSAGE);

			sorteioComputador = "Números sorteados: " + " \n" + sorteio[0] + " \n" + sorteio[1] + " \n" + sorteio[2]
					+ " \n" + sorteio[3] + " \n" + sorteio[4] + " \n" + sorteio[5];
		}

		int nroAcertos = contaAcertos(sorteio, aposta);

		JOptionPane.showMessageDialog(null,
				apostaUsuario + "\n" + sorteioComputador + " \n Números de acertos: \n " + nroAcertos,
				"Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);

		switch (nroAcertos) {

		case 4:
			// System.out.println("Parabéns. Você acertou a quadra!");
			JOptionPane.showMessageDialog(null, "Parabéns. Você acertou a quadra!", "Simulador Da Mega Sena",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 5:
			// System.out.println("Parabéns. Você acertou a quina!");
			JOptionPane.showMessageDialog(null, "Parabéns. Você acertou a quina!", "Simulador Da Mega Sena",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case 6:
			// System.out.println("Parabéns. Você é campeão da MegaSena!");
			JOptionPane.showMessageDialog(null, "Parabéns. Você é campeão da MegaSena!", "Simulador Da Mega Sena",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		default:
			// System.out.println("Não foi dessa vez. Tente novamente!");
			JOptionPane.showMessageDialog(null, "Tente novamente!", "Simulador Da Mega Sena",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}// Fim do main

	// Função retorna uma array com 6 números gerados randomicamente (API do
	// Java), sem duplicidade, representando o sorteio da megasena.
	static int[] sorteaSena() {

		int[] resultado = new int[NUMERO_DEZENAS];

		for (int i = 0; i < NUMERO_DEZENAS; i++) {

			int sorteado;
			boolean repetido = false;

			do {
				// número aleatório de 1 a 60
				sorteado = (int) (Math.random() * 60) + 1;
				repetido = existeNumero(resultado, sorteado);
			} while (repetido); // evita repetição de número
			resultado[i] = sorteado;
		}
		return resultado;
	}

	// Função compara cada número apostado, com os números sorteados. Por fim
	// retorna a quantidade de acertos.
	static int contaAcertos(int[] sorteio, int[] aposta) {

		int acertos = 0;

		for (int i = 0; i < NUMERO_DEZENAS; i++) {

			int nroAposta = aposta[i];

			// compara cada número apostado com os sorteados
			if (existeNumero(sorteio, nroAposta)) {
				acertos++;
			}
		}
		return acertos;
	}

	// Função indica se o n existe no array numeros. Útil para validar
	// duplicadade de dados.
	static boolean existeNumero(int[] numeros, int n) {

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == n) {
				return true;
			}
		}
		return false;
	}
}