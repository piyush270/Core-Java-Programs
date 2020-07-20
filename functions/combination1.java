package functions;

import java.util.Scanner;

public class combination1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		int nfact=1;
		for(int i=1;i<=n;i++)
		{
			nfact=nfact*i;
		}
		int rfact=1;
		for(int i=1;i<=r;i++)
		{
			rfact=rfact*i;
		}
		int n_1fact=1;
		for(int i=1;i<=n-r;i++)
		{
			n_1fact=n_1fact*i;
		}
		int res=nfact/(rfact*n_1fact);
		System.out.println(res);
	}
}
