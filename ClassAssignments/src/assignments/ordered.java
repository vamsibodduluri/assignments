package assignments;

import java.util.Scanner;

public class ordered {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		boolean d = (a < b && b < c) || (c < b && b < a);
		System.out.println(d);
		sc.close();

	}

}
