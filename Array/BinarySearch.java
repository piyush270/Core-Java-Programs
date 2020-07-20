package Array;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {1,2,3,4,5,6}; //input array
		int res=binarySearch(input,1); //call Binary Search
		if(res==-1)
		System.out.println("Element Not Present");
		else
			System.out.println("Element present at "+ res+ " location");
 
	}
	public static int binarySearch(int[] input,int item)
	{
		int start=0;
		int end=input.length-1;
		while(start<=end)
		{
		int mid= (start+end)/2; // check for mid
		
		if(input[mid]==item)//check if mid element equal to the current search itrm
			return mid+1;
		
		else if(item>mid) //if search item is greater than mid set start to the very next element of mid 
			start=mid+1;
		
		else
			end=mid-1;//if search item is less than mid set end to the previous element of mid
		
			
		}
		return -1; // return if element not found
		
	}

}
