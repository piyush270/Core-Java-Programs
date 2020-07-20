package OOPS;

public class DynamicArray {

	private int[] data;
	private int nextIndex;
	
	public int[] getdata()
	{
		return data;
	}
	public int getIndex()
	{
		return nextIndex;
	}

	DynamicArray()
	{
	  	data= new int[5];
	  	nextIndex=0;
	}
	public void add(int item)
	{
		if(nextIndex==data.length)
		{
			reconstruct(item);
		}
		else
		{
			data[nextIndex]=item;
			nextIndex++;
		}
	}
	private void reconstruct(int item)
	{
		int temp[]=data;
		data= new int[temp.length*2];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	     add(item); 
		
	}
	public int size()
	{
		return nextIndex;
	}
	public void setValueAt(int index,int item)
	{
		if(index>nextIndex)
			throw new ArrayIndexOutOfBoundsException("Try To Acess Invalid index");
		else if(index<nextIndex)
		{
			data[index]=item;
		
		}
		else
			add(item);			
	}
	public int  removeLast()
	{
		if(nextIndex==0)
			throw new ArrayIndexOutOfBoundsException("Empty Array");
		else
		{
			int temp=data[nextIndex-1];
			data[nextIndex-1]=0;
			nextIndex--;
			return temp;
			
		}
	}
	public boolean isEmpty()
	{
		if(nextIndex==0)
			return true;
		else
			return false;
	}
	public int getElement(int index)
	{
		if(nextIndex==0)
		{
			throw new ArrayIndexOutOfBoundsException("Empty Array");
		}
		else
			return data[index];
	}
}
