package arquivos_path;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bloco_try_with_resources {
	
	//	Bloco try-with-resources
	//	• É um bloco tryque declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
	//	• Disponível no Java 7 em diante
	//	• https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html

	public static void main(String[] args) {
		
		String path = "C:\\Douglas\\Java\\ExerciciosJava\\arquivos\\ler.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
