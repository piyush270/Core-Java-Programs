package Array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,5,7,0,2};
     bubbleSort(arr);
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.print(arr[i]+" ");
     }
     
		
	}
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
