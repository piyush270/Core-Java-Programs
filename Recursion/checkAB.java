package Recursion;

public class checkAB {

	public static void main(String[] args) {
		String input="abba";
		System.out.print(check(input));
		
	}
	public static boolean check(String input)
	{
	   // base case
		if(input.length()<=1)
		{
			if(input.charAt(0)=='a')
				return true;
			else
				return false;
		}
		//otherwise
		boolean res=check(input.substring(1));
		 if(res==true)
		 {
			if(input.charAt(0)=='a')
			{
				if(input.charAt(1)=='a')
					return true;
				else if(input.charAt(1)=='b'&&input.charAt(2)=='b')
					return true;
				else
					return false;
			}
			else
				return false;
		 }
		 else return false;
				 
				 

	}
}
