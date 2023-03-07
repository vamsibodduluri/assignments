package assignments;

import java.util.Scanner;

public class MonthDate {

	public static void main(String[] args) {

		int month, date;
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		date = sc.nextInt();

		boolean res = (month == 3 && date >= 20 && date <= 31) || (month == 4 && date >= 1 && date <= 30)
				|| (month == 5 && date >= 1 && date <= 31) || (month == 6 && date <= 20);

		System.out.println(res);

		sc.close();

	}

}
