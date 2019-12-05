import java.util.Random;
import java.util.Vector;

public class Mega_sena3 {

	public static void main(String[] args) {

		Vector<Integer> jogo = new Vector<Integer>();
		Random gen = new Random();
		while (jogo.size() < 6) {
			int dezenas = (gen.nextInt() / 60) + (gen.nextInt() / 1000000) * 3;
			System.out.println("dezena gerada = " + dezenas);
			boolean pass = true;
			while (true) {
				if (dezenas < 1) {
					dezenas = (gen.nextInt() / 1000000) + (gen.nextInt() / 1000000) * 2;
					pass = false;
					System.out.println("dezena gerada = " + dezenas);
				} else if (dezenas > 25) {
					dezenas = (gen.nextInt() / 1000000) + (gen.nextInt() / 1000000) * 4;
					pass = false;
					System.out.println("dezena gerada = " + dezenas);
				}
				if (pass) {
					break;
				}
				pass = true;
			}
			System.out.println("dezena add = " + dezenas);
			if (jogo.contains(dezenas)) {
				dezenas = -100;
			} else {
				jogo.add((int) dezenas);
			}
		}
		System.out.println(jogo);
	}

}