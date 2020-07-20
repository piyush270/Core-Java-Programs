package Patterns;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		print(n);
	}
	public static void print(int n)
	{
		int i=0;
		while(i<(n+1)/2)
		{
			int count=0;
			System.out.print("*");
			int j=1;
			int val=1;
			while(j<2*i)
			{
			  System.out.print(val);
			  count++;
			  if(count>=i)
				  val--;
			  else
				  val++;
			  j++;
			}
			if(i!=0)
			System.out.print("*");
			System.out.println();
		i++;	
		}
		i=n-(n+1)/2-1;
		while(i>=0)
		{
			int count=0;
			System.out.print("*");
			int j=1;
			int val=1;
			while(j<2*i)
			{
				System.out.print(val);
				count++;
				if(count>=i)
					val--;
				else
					val++;
				j++;
			}
			if(i!=0)
				System.out.print("*");
			System.out.println();
			i--;
				
		}
		
	}
}
