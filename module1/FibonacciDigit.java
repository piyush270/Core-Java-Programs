package module1;

import java.util.Scanner;

public class FibonacciDigit {

	public static void main(String... string) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
	  
		 int a=0,b=1;
		 while(!(a>n))
		 {
			 if(n==a) {
				 System.out.println("YES");
				 return;
			 }
			 int c=a+b;
			 a=b;
			 b=c;
		 }
		 System.out.println("NO");
	}
}
