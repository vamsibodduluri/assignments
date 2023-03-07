package assignments;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {

		double weight, height;
		Scanner sc = new Scanner(System.in);

		weight = sc.nextDouble();
		height = sc.nextDouble();
		double BMI = weight / (height * height);
		System.out.println(BMI);
		sc.close();
	}

}
