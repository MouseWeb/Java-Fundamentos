package arquivos_path;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritere_BufferedWriter {
	
	//	Classes
	//	• FileWriter(streamde escrita de caracteres em de arquivos) 
	//		• https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html
	//		• Cria/recria o arquivo: new FileWriter(path) 
	//		• Acrescenta ao arquivo existente: new FileWriter(path, true)
	//	• BufferedWriter(mais rápido) -> trata os dados com Buffered.
	//		• https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html

	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		
		String path = "C:\\Douglas\\Java\\ExerciciosJava\\arquivos\\escrever.txt";
		
		//try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // recria o aqv toda vez que executar
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) { // o parametro (true) indica que não quero recriar o aqv 
																				  // e sim adcionar no aqv existente.
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
