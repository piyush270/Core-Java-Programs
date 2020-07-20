package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		
		int i=1;
		int val=1;
		while(i<=n)
		{
			int space=1;
			while(space<=n-i)
			{
				System.out.print(" ");
				space=space+1;
			}
				
				int j=1;
				while(j<=i)
				{
					System.out.print(val);
					val++;
					j++;
				}
				
			
			System.out.println();
			i=i+1;
		}
	}
}
