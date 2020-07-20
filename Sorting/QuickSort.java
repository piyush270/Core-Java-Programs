package Sorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] input= {1,8,2,1,8,5,0};
		quicksort(input,0,input.length-1);
		printArray(input);
		
        
	}
	public static void quicksort(int[] input,int start,int end)
	{
		//base case
		if(start>=end)
			return;
		int pivotpos=partition(input,start,end);// Divide the array into two halves
		quicksort(input,start,pivotpos-1);//sort left part
		quicksort(input,pivotpos+1,end);//sort right part
	}
	public static int partition(int[] input, int start, int end)
	{
		// 1. find pivot element
		int pivot=input[start];
		
		
		// 2. place pivot element into its correct position
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(input[i]<pivot)
				count++;
		}
		int pivotpos=start+count;
		int temp=input[start];      
		
		input[start]=input[pivotpos]; 
		input[pivotpos]=temp;
		
		// 3. ensure that right_portion<pivot & left_portion>pivot
		int i=start;
		int j=end;
		outer:
		while(i<pivotpos && j>pivotpos)
		{
			if(input[i]>pivot)
			{
				if(input[j]<pivot) 
				{
			        int temp1=input[i];
					input[i]=input[j];
					input[j]=temp1;
					i++;
					j--;
					continue outer;
					
				}
				else 
					j--;
				 continue outer;
				
			}
			i++;
		}
		
		// 4. return pivot position 
		return pivotpos;
	}
	public static void printArray(int[] input)
	{
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}
	}
	

}
