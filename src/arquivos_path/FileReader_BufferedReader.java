package arquivos_path;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferedReader {
	
	//	Classes
	//		� FileReader(streamde leitura de caracteres a partir de arquivos) 
	//			� https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html
	//		� BufferedReader(mais r�pido) 
	//			� https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html
	//			� https://stackoverflow.com/questions/9648811/specific-difference-betweenbufferedreader-and-filereader
	
	// stream = seguinifica uma seguencia, exemplo: quando estanciar o FileReader vai estabelecer uma segu�ncia de leitura 
	//			apartir de um arquivo, a m�dia que for precisando ler esse arquivo ir� na vegando na (stream).
	
	// BufferedReader = ele vai ser instanciado apartir do (FileReader) e ele implementa algumas otmiza��es ultilizando o 
	//					(Buffered de m�moria), ele � mais r�pido.

	public static void main(String[] args) {
		
		String path = "C:\\Douglas\\Java\\ExerciciosJava\\arquivos\\ler.txt";
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
