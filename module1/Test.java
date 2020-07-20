package module1;
import java.util.Scanner;
public class Test{  
	public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       sc.close();
       int smaller=a;
       if(b>smaller)
       {
    	   if(b%smaller==0)
    	   {
    		   System.out.println(smaller);
    	   }
    	   else
    	   {
    		   int gcd=1;
    		   for(int i=1;i<=smaller;i++)
    		   {
    			   if(a%i==0&&b%i==0)
    			   {
    				   gcd=i;
    			   }
    		   }
    		   System.out.println(gcd);
    	   }
       }
       else {
    	   smaller=b;
    	   if(a%smaller==0)
    	   {
    		   System.out.println(smaller);
    	   }
    	   else
    	   {
    		   int gcd=1;
    		   for(int i=1;i<=smaller;i++)
    		   {
    			   if(a%i==0&&b%i==0)
    			   {
    				   gcd=i;
    			   }
    		   }
    		   System.out.println(gcd);
    	   }
       }
       	}
} 
