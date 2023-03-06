package assignments;

public class SumOfDice {

	public static void main(String[] args) {

		/*
		 * double a,b,res; a=Math.random(); b=Math.random(); res= a + b;
		 */

		int a, b, res;
		a = (int) (Math.random() * 6 + 1);
		b = (int) (Math.random() * 6 + 1);
		res = a + b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(res);

	}

}
