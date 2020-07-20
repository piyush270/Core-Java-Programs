package Patterns;

import java.util.Scanner;

public class Pattern9 {
    
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	sc.close();
	
	int i=1;
	char startchar='A';
	while(i<=N)
	{
		int j=1;
		while(j<=N)
		{
			System.out.print((char)(startchar+j-1));
			j++;
		}
		System.out.println();
		i++;
	}
  }
}