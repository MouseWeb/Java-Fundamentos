package arquivos_path;

import java.io.File;
import java.util.Scanner;

public class Manipulando_Pastas_Com_File {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um caminho de pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Lista somente quem é diretório ou pastas, vai criar um vertor contendo todas as pasta do diretório informado.
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		// Lista somente quem é arquivos, vai criar um vertor contendo todos os arquivos no diretório informado.
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos:");
		for (File file : files) {
			System.out.println(file);
		}
		
		// criar uma sub pasta apartir do diretório infomado.
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretório criado com êxito: " + success);
		sc.close();

	}

}
