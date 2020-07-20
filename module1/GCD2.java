package module1;
import java.util.Scanner;
public class GCD2 {

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		while(true)
		{
			if(a%b==0)
			{
				System.out.println(b);
				return;
			}
			else {
				int temp=a%b;
				a=b;
				b=temp;
			}
		}
		
	}
}
