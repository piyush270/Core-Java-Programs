package module1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String... string) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int f1=0;
		int f2=1;
		System.out.print(f1+" "+f2+" ");
		for(int i=3;i<n;i++)
		{
			int sum=f1+f2;
			System.out.print(sum+" ");
			f1=f2;
			f2=sum;
		}
	}
}
