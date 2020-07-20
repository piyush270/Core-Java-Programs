package module1;

import java.util.Scanner;

public class Prime {

	public static void main(String... arg)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		System.out.println(2);
	outer:
		for(int i=3;i<=n;i++)
		{
		  for(int j=2;j<i;j++)
		  {
			  if(i%j==0)
			  { 
				  continue outer; 
				  
			  }
		  }
		  System.out.println(i);
			
		}
		
	}
}
