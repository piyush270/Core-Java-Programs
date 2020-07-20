package String;

public class Solution {
	public static void main(String[] args) {
		int[] input= {1,2,3};
		int[][] res=subsets(input);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
		
	}

	public static int[][] subsets(int input[]) {
		// Write your code here
		return subsets(input,0);
	}
	public static int[][] subsets(int input[],int si) {
		// Write your code here
		if(si == input.length) {
			int res[][] = {{}};
			return res;
		}
		int res [][] = subsets(input,si+1);
		int temp[][] = new int[2*res.length][]; 
		for(int i = 0; i<res.length;i++) {
			temp[i]= new int[res[i].length];
			for(int j = 0; j<res[i].length; j++) {
				temp[i][j] = res[i][j];
			}
		}
		for(int i = 0; i<res.length;i++) {
			int j = 0;
			temp[i+res.length]= new int[res[i].length+1];
			temp[i+res.length][j] = input[si];
			for(j = 0; j<res[i].length; j++) {
				temp[i+res.length][j+1] = res[i][j];
			}
		}
		return temp;
	}
	
	
}
    
