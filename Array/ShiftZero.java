package Array;

import java.util.Scanner;

public class ShiftZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
       sc.close();
       shiftZero(arr);
     
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
	}
	public static void shiftZero(int[] arr)
	{
		int i=0;
		int j=0;
		while(i<arr.length)
		{
			if(arr[i]!=0)
			{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
			i++;
			}
			else
				i++;
		}

	}

}
