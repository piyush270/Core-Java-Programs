package Recursion;

public class KeypadCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=21;
        String[] ans=keypad(n);
        printArray(ans);
	}
	public static void printArray(String[] ans)
	{
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	public static String[] keypad(int n)
	{
		//base case
		if(n==0||n==1)
		{
			String[] ans= {" "};
			return ans;
		}
		//otherwise
		String[] ans=keypad(n/10);
		String[] res=helper(n%10);
		String[] temp = new String[res.length*ans.length];
		int k=0;
		for(int i=0;i<res.length;i++)
		{
		   for(int j=0;j<ans.length;j++)
		   {
			   temp[k]=ans[j]+res[i];
			   k++;
		   }
		}
		return temp;
		
	}
	public static String[] helper(int n)
	{
		
		if(n==2)
		{
			String[] res= {"a","b","c"};
			return res;
		}
		if(n==3)
		{
			String[] res= {"d","e","f"};
			return res;
		}
		if(n==4)
		{
			String[] res= {"g","h","i"};
			return res;
		}
		if(n==5)
		{
			String[] res= {"j","k","l"};
			return res;
		}
		if(n==6)
		{
			String[] res= {"m","n","o"};
			return res;
		}
		if(n==7)
		{
			String[] res= {"p","q","r","s"};
			return res;
		}
		if(n==8)
		{
			String[] res= {"t","u","v"};
			return res;
		}
		if(n==9)
		{
			String[] res= {"w","x","y","z"};
			return res;
		}
		else {
			String[] ans= {""};
			return ans;
		}
			
			
	}

}
