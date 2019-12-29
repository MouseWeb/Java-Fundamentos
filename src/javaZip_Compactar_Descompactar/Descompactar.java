package javaZip_Compactar_Descompactar;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
 
public class Descompactar {
 
	private static final int BUFFER = 2048;
 
	public static void main(String argv[]) {
		try {
			
			// Caminho do arquivo ZIP
			String zipFile = "C:\\Douglas\\Java\\ExerciciosJava\\arquivos\\zipado\\ler.zip";
			String pastaDestino = "C:\\Douglas\\Java\\ExerciciosJava\\arquivos\\zipado\\descompactado\\";
			
			File file = new File(pastaDestino);
 
			// Se não existir a pasta destino
			// será criada por nosso programa
			if (file.exists() == false) {
				file.mkdirs();
			}
 
			BufferedOutputStream dest = null;
			FileInputStream fis = new FileInputStream(zipFile);
			ZipInputStream zis = new ZipInputStream(
					new BufferedInputStream(fis));
			
			ZipEntry entry;
			
			while ((entry = zis.getNextEntry()) != null) {
				
				System.out.println("Extraindo o arquivo: " + entry);
				
				int count;
				byte data[] = new byte[BUFFER];
				
				// Cria os arquivos no disco
				FileOutputStream fos = new FileOutputStream(pastaDestino + entry.getName());
				dest = new BufferedOutputStream(fos, BUFFER);
				
				while ((count = zis.read(data, 0, BUFFER)) != -1) {
					dest.write(data, 0, count);
				}
				
				dest.flush();
				dest.close();
			}
			
			zis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
 
}