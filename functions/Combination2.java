package functions;

import java.util.Scanner;

public class Combination2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		
		System.out.print(factorial(n)/(factorial(r)*factorial(n-r)));
		} 
	public static int factorial(int n)
	{int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	
	
}