package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt(); 
		sc.close();
		
		int i=1;
		while(i<=N)
		{
			int j=1;
			int counter=i;
			while(j<=i)
			{
				System.out.print(counter);
				counter++;
				j++;
			}
			System.out.println();
			
			i++;
		}
	}

}
