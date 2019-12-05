package generics;

import java.util.Scanner;
import generics.services.PrintService;

public class Generics {

//	Generics
//		• Generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. Seus benefícios são:
//			• Reuso
//			• Type safety
//			• Performance
//		• Uso comum: coleções
//			List<String> list = new ArrayList<>();
//			list.add("Maria");
//			String name = list.get(0);

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);

		sc.close();
	}

}
