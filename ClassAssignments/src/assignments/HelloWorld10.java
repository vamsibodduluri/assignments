package assignments;

import java.util.*;

public class HelloWorld10 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n,i;
		n = sc.nextInt();
		for (i=0;i<n;i++) {
			System.out.println(i+1 + ".Hello World");
		}
		sc.close();
	}
		
}
