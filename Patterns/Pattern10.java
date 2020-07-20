package Patterns;

import java.util.Scanner;

public class Pattern10 {
    
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	sc.close();
	
	int i=1;
	while(i<=N)
	{
		int j=1;
		char startchar='A';
		while(j<=N)
		{
			System.out.print((char)(startchar+i-1));
			startchar=(char)(startchar+1);
			j++;
		}
		System.out.println();
		i++;
	}
  }
}
