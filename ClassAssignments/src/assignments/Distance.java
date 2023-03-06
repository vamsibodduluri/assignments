package assignments;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		double x,y,z,res;
		Scanner sc = new Scanner(System.in);
		x=sc.nextDouble();
		y=sc.nextDouble();
		z=(x*x)+(y*y);
		res = Math.sqrt(z);
		System.out.println(res);
		sc.close();
		
	}

}
