package assignments;

import java.util.Scanner;

public class QuadraticExp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double a, b, c, disc, sqrt, res1, res2;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		disc = (b * b) - (4.0 * a * c);
		sqrt = Math.sqrt(disc);

		res1 = (-b + sqrt) / 2.0 * a;
		res2 = (-b - sqrt) / 2.0 * a;

		System.out.println(res1);
		System.out.println(res2);

		sc.close();

	}

}
