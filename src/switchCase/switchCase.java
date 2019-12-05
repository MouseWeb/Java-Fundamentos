package switchCase;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String day;
		switch (x) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		default:
			day = "Invalid value";
		}
		System.out.println("Day: " + day);

		////////////////////////////////////////////////////

		Scanner c = new Scanner(System.in);
		int x1 = c.nextInt();

		String days;

		if (x1 == 1) {
			days = "Sunday";
		} else if (x1 == 2) {
			days = "Monday";
		} else if (x1 == 3) {
			days = "Tuesday";
		} else if (x1 == 4) {
			days = "Wednesday";
		} else if (x1 == 5) {
			days = "Thursday";
		} else if (x1 == 6) {
			days = "Friday";
		} else if (x1 == 7) {
			days = "Saturday";
		} else {
			days = "Invalid value";
		}
		System.out.println("Day: " + days);

	}
}
