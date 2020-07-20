package Patterns;
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int n1=(n+1)/2;
		int n2=(n-1)/2;
		
		int i=1;
		while(i<=n1)
		{
			int spaces=1;
			while(spaces<=n1-i)
			{				
				System.out.print(" ");
				spaces++;
			}
			int j=1;
			while(j<=2*i-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		i=n2;
		while(i>=1)
		{
			int spaces=1;
			while(spaces<=n2-i+1)
			{
				System.out.print(" ");
				spaces++;
				
			}
			int j=1;
			while(j<=2*i-1)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
