package Patterns;

import java.util.Scanner;

public class Pattern12 {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int i=1;
		while(i<=n)
		{
			int space=0;
			while(space<i-1)
			{
				System.out.print(" ");
				space++;
				
			}
			int j=1;
			while(j<=n-i+1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
