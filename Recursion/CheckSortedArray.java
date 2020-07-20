package Recursion;

public class CheckSortedArray {

	public static void main(String[] args) {
	
		int input[]= {1,2,3,8,5};
		System.out.println(checkSortedBetter(input));
	}
	static boolean checkSortedBetter(int[] input)
	{
		return checkSortedBetter(input,0);
	}
	static boolean checkSortedBetter(int[] input, int startIndex)
	{
		if(startIndex>=input.length-1)
		return true;
		if(input[startIndex]>input[startIndex+1])
			return false;
		boolean res= checkSortedBetter(input,startIndex+1);
		return res;
		
	}
		
	static boolean checkSorted(int input[])
	{
		if(input.length<=1)
		{
			return true;
		}
		if(input[0]>input[1])
			return false;
		
		int[] smallarray= new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallarray[i-1]=input[i];
		}
		boolean value=checkSorted(smallarray);
		return value;
		
	    	
	}
}
