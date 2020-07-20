package module1;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		int pv=1;
		int sum=0;
		while(n>0)
		{
			int num=n%10;
			sum=sum+num*pv;
			pv=pv+2;
			n=n/10;
		}
		System.out.print(sum);
		
	}
}
