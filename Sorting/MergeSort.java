package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		int input[]= {10,9,8,7,6,5,2,4,3,2,1,1};
		mergesort(input,0,input.length-1);
		printArray(input);
	}
	public static void printArray(int[] input)
	{
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
	}
	public static void mergesort(int[] input, int start, int end)
	{
		//base case
		if(start>=end)
			return;
		int mid = (start+end)/2;
        mergesort(input,start,mid);
        mergesort(input,mid+1,end);
        merge(input,start,end);
	}
	public static void merge(int[] input, int start, int end)
	{
		int mid=(start+end)/2;
		int i=start;
		int j=mid+1;
		int k=start;
		int temp[]=new int[input.length];
		
		while(i<=mid && j<=end)
		{
			if(input[i]<input[j])
				temp[k++]=input[i++];
			else
				temp[k++]=input[j++];
		}
		
		while(i<=mid)
			temp[k++]=input[i++];
		while(j<=end)
			temp[k++]=input[j++];
		
	    for(i=start;i<=end;i++)
	    {
	    	input[i]=temp[i];
	    }
		
		
	}
	
}
