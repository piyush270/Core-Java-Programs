package Array;

import java.util.Scanner;

public class InsertionSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   int n=	sc.nextInt();
		   int[] arr=new int[n];
		   
		   for(int i=0;i<n;i++)
		   {
			   arr[i]=sc.nextInt();
		   }
		   insertionSort(arr);
	}
	public static void insertionSort(int[] arr)
   {
		for(int i=0;i<arr.length-1;i++)
		{
			int min=arr[i];
			int minIndex=i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					minIndex=j;
				}
				
			}
			if(minIndex!=i)
			{
				arr[minIndex]=arr[i];
				arr[i]=min;
			
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
