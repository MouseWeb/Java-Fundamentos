package arquivos_path;

import java.io.File;
import java.util.Scanner;

public class Informacoes_Caminho_Arquivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um caminho de pasta: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("obter o caminho: " + path.getPath());
		System.out.println("obter pai: " + path.getParent());
		System.out.println("obter nome: " + path.getName());
		
		sc.close();

	}

}
