package interface_comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interface_comparable.entities.Employee;

public class InterfaceComparable {

	public static void main(String[] args) {
		
		System.out.println("Fernando Haddad".compareTo("Jair Bolsonaro") + " Haddad");
		
		System.out.println("Jair Bolsonaro".compareTo("Fernando Haddad") + " Jair");
		
		List<Employee> list = new ArrayList<>();
		
		// Caminho do arquivo no servidor
		String path = "C:\\Douglas\\Java\\ExerciciosJava\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			// Ler uma line do arquivo 
			String employeeCsv = br.readLine();
			// Enquanto essa line for diferente de null vou add esse valor na list
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add( new Employee(fields[0], Double.parseDouble(fields[1])));
				// Vou ler a proxima line
				employeeCsv = br.readLine();
			}
			
			// Ordernando a minha list
			Collections.sort(list);
			// Pecorre a minha list e imprimindo cada um dos resultados
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}