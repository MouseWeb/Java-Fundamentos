package set_HashSet_TreeSet_LinkedHashSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import set_HashSet_TreeSet_LinkedHashSet.entities.LogEntry;

//	Problema exemplo - Log de site
//		Um site de internet registra um log de acessos dos usu�rios. 
//		Um registro de log consiste no nome de usu�rio (apenas uma palavra) e o instante em que o usu�rio acessou o site no padr�o ISO 8601,
//		separados por espa�o, conforme exemplo. Fazer um programa que leia ologdeacessosapartirdeumarquivo,eda�informequantosusu�rios 
//		distintosacessaramosite.

public class SetLog {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o caminho completo do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Set<LogEntry> set = new HashSet<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];

				Date moment = Date.from(Instant.parse(fields[1]));
				set.add(new LogEntry(username, moment));

				line = br.readLine();

			}

			System.out.println("Total de usu�rios: " + set.size());

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
