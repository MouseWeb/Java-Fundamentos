package generics_Delimitados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import generics_Delimitados.entities.Product;
import generics_Delimitados.services.CalculationService;

// Programa mostra o numero maior dentro de uma lista de numeros inteiros.
public class GenericsDelimitados {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		String path = "C:\\Douglas\\Java\\ExerciciosJava\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();

			}

			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {

			System.out.println("Error: " + e.getMessage());

		} 

	}

}
