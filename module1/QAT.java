package module1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class QAT
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Loan Amount :");
		double loan=Double.parseDouble(sc.nextLine());
		System.out.print("Number of years :");
		double years=Double.parseDouble(sc.nextLine());
        System.out.println("Interest Rate"+" \t"+"Monthly Payment"+"\t "+"Total Payment"+"\n");		
			cal(loan,years);
			sc.close();


	}
	public static void cal(double loan, double years)
	{
		DecimalFormat df=new DecimalFormat("#.##");
		
     for(double IntRate=5.000;IntRate<=8.000;IntRate=IntRate+0.125)
		{
	     double monthlyInterestRate= IntRate/1200;
         double monthlyPayment= (loan*(monthlyInterestRate))/(1-1/(Math.pow((1+(monthlyInterestRate)),(12*years)) ));

	     double totalPayment=monthlyPayment*12*years;

	     System.out.println(df.format(IntRate)+"%"+"\t\t"+df.format(monthlyPayment)+"\t\t" +df.format(totalPayment));
		 
		}

	}
}

	
	


