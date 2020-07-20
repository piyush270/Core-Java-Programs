package module1;
import java.util.Scanner;
public class Testing{	
	
	
    public static void main(String... arg)
    {
        String s="I am Piyush";
        String arr[]=s.split(" ");
        System.out.println(s.length());
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
    }
}