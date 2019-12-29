package javaZip_Compactar_Descompactar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
 
public class Compactar {

	private static final String INPUT_FILE = "C:\\Douglas\\Java\\ExerciciosJava\\arquivos\\ler.txt";
	private static final String OUTPUT_FILE = "C:\\Douglas\\Java\\ExerciciosJava\\arquivos\\zipado\\ler.zip";
	private static FileInputStream fileInputStream;
 
	// Método principal que inicia nosso sistema
	public static void main(String[] args) {
		zipFile(new File(INPUT_FILE), OUTPUT_FILE);
	}
 
	public static void zipFile(File inputFile, String zipFilePath) {
		try {
 
			FileOutputStream fileOutputStream = new FileOutputStream(zipFilePath);
			ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
 
			// Um ZipEntry é um apontamento para um arquivo ZIP
			ZipEntry zipEntry = new ZipEntry(inputFile.getName());
			zipOutputStream.putNextEntry(zipEntry);
 
			fileInputStream = new FileInputStream(inputFile);
			byte[] buf = new byte[1024];
			int bytesRead;
 
			// Realiza a leitura dos dados do arquivo
			// e escreve no stream de saída que será o Zip
			while ((bytesRead = fileInputStream.read(buf)) > 0) {
				zipOutputStream.write(buf, 0, bytesRead);
			}
 
			// Fecha o arquivo ZipEntry que armazena o conteúdo
			// do arquivo
			zipOutputStream.closeEntry();
			zipOutputStream.close();
			fileOutputStream.close();
 
			System.out.println("Arquivo de entrada: " + inputFile.getCanonicalPath() 
							+ "\nsaida do arquivo ZIP: " + zipFilePath);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
