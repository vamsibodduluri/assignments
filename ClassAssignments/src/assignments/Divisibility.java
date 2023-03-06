package assignments;

import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();

		/*
		 * if (a % 7 == 0 && b % 7 == 0) { System.out.println(true); } else {
		 * System.out.println(false);
		 * 
		 * }
		 */

		boolean c = (a % 7 == 0) && (b % 7 == 0);
		System.out.println(c);
		sc.close();
	}

}
