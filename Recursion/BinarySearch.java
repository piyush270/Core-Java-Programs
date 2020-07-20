package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {1,2,3,4,5};
		System.out.println(binarySearch(input,5));

	}
	public static int binarySearch(int[] input,int element)
	{
		return binarySearch(input,element,0,input.length-1);
		
	}
	public static int binarySearch(int[] input,int element,int start, int end)
	{
		// base case
		if(start>end)
			return -1;
		//otherwise
		int mid=(start+end)/2;
		if(input[mid]==element)
			return mid+1;
		else if(input[mid]>element)
			return binarySearch(input,element,start,mid-1);
		else
			return binarySearch(input,element,mid+1,end);
		
		
		
		
	}

}
