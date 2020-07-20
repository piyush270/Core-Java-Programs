package Recursion;

public class StringSubsequence {

	public static void main(String[] args) {
		String input="xy";
		String[] res=sub(input);
		printSub(res);
	}
	public static void printSub(String[] res)
	{
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	public static String[] sub(String str)
	{
		// base case
		if(str.length()<=0)
		{
			String[] ans= {" "};
			return ans;
		}
		
		String[] res=sub(str.substring(1));//recurive call
		String[] temp= new String[2*res.length];
		int k=0;
		for(int i=0;i<res.length;i++)
		{
			temp[k]=res[i];
			k++;
		}
		for(int i=0;i<res.length;i++)
		{
			temp[k]=str.charAt(0)+res[i];
			k++;
		}
		return temp;
			
	}
}
