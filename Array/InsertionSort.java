package Array;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int i=0;
		while(i<arr.length)
		{
		  //int min=arr[i];
          int index=findMin(arr,i);
          if(index!=i)
          {
        	  int temp=arr[index];
        	  arr[index]=arr[i];
        	  arr[i]=temp;
          }
          i++;
        	  
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
	public static int findMin(int[] arr,int n)
	{
		int Min=Integer.MAX_VALUE;
		int i,index=0;
		for(i=n;i<arr.length;i++)
		{
			if(arr[i]<Min)
			{
				Min=arr[i];
				index=i;
			}
		}
		return index;
	}

}
