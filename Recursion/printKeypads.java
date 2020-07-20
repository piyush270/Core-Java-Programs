package Recursion;

public class printKeypads {
          public static void main(String[] args) {
			int input=234;
			//reverse the number to get the desired output fassion
		
			 printKeypad(input);
			
		}
          public static void printKeypad(int input, String output)
          {
        	  //base case
        	  if(input==0)
        	  {
        		  System.out.println(output);
        		  return;
        	  }
        	  //otherwise
        	  String[] res=helper(input%10);
        	  for(int i=0;i<res.length;i++)
        	  {
        	   printKeypad(input/10,output+res[i]);
        	  }
        	  
        	  
          }
          public static void printKeypad(int input)
          {
        	  int sum=0;
        	  while(input>0)
  			{
  				int a=input%10;
  				sum=sum*10+a;
  				input=input/10;
  			}
        	  printKeypad(sum,"");
          }
          public static String[] helper(int input)
          {
        	  if(input==2)
        	  {
        		  String[] res= {"a","b","c"};
        		  return res;
        	  }
        	  if(input==3)
        	  {
        		  String[] res= {"d","e","f"};
        		  return res;
        	  }
        	  if(input==4)
        	  {
        		  String[] res= {"g","h","i"};
        		  return res;
        	  }
        	  if(input==5)
        	  {
        		  String[] res= {"j","k","l"};
        		  return res;
        	  }
        	  if(input==6)
        	  {
        		  String[] res= {"m","n","o"};
        		  return res;
        	  }
        	  if(input==7)
        	  {
        		  String[] res= {"p","q","r","s"};
        		  return res;
        	  }
        	  if(input==8)
        	  {
        		  String[] res= {"t","u","v"};
        		  return res;
        	  }
        	  if(input==9)
        	  {
        		  String[] res= {"w","x","y","z"};
        		  return res;
        	  }
        	  else 
        	  {
        		  String[] res= {""};
        		  return res;
        	  }
          }
}
