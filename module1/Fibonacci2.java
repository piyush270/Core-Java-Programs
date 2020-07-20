package module1;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String... string) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int a=0,b=1;
		while(a<n)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}
