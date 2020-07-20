package Recursion;

public class printsubsequence {
    public static void main(String[] args) {
		String input="xy";
		prntsub(input);
	} 
    public static void prntsub(String input, String outputSoFar)
    {
    	//base case
    	if(input.length()==0)
    	{
    		System.out.println(outputSoFar);
    		return;
    	}
    	prntsub(input.substring(1),outputSoFar);    //not taking first element in the output
    	prntsub(input.substring(1),outputSoFar+input.charAt(0));// taking first element in the  output
    }
    public static void prntsub(String input)
    {
    	prntsub(input,"");
    }
}
