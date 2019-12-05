package arquivos_path;

import java.io.File;
import java.util.Scanner;

public class Manipulando_Pastas_Com_File {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um caminho de pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		// Lista somente quem � diret�rio ou pastas, vai criar um vertor contendo todas as pasta do diret�rio informado.
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Pastas:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		// Lista somente quem � arquivos, vai criar um vertor contendo todos os arquivos no diret�rio informado.
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos:");
		for (File file : files) {
			System.out.println(file);
		}
		
		// criar uma sub pasta apartir do diret�rio infomado.
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Diret�rio criado com �xito: " + success);
		sc.close();

	}

}
