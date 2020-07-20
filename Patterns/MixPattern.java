package Patterns;

import java.util.Scanner;


public class MixPattern {
  public static void main(String[] args) {
	
	  Scanner sc= new Scanner(System.in);
	  int n=sc.nextInt();
	  sc.close();
	  
	  int i=1;
	  while(i<=n)
	  {
		  int j=1;
		  while(j<=n)
		  {
			  if(i==j)
			  {
				  System.out.print("*");
				  
			  }
			  else
				  System.out.print(0);
			  j++;
		  }
		  System.out.print("*");
		  j--;
		  while(j>=1)
		  {
			if(i==j)
			{
				System.out.print("*");
			}
			else
				System.out.print(0);
			j--;
		  }
		  
		  System.out.println();
		  i++;
	  }
}
}
