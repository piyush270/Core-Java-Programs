package Array;

import java.util.Scanner;

public class LargestInArray {

	public static void main(String[] args) {
		int input[]=InputArray();
		int n=largest(input);
		System.out.println(n);
	}
	public static int[] InputArray()
	{
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++)
		{
			 input[i]=sc.nextInt();
			
		}
		sc.close();
		return input;
		
	}
	public static int largest(int[] input)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.length;i++)
		{
			if(input[i]>max)
				max=input[i];
		}
		return max;
	}
}
