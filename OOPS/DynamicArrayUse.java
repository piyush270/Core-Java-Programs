package OOPS;

public class DynamicArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          DynamicArray d = new DynamicArray();
          d.add(1);
          d.add(2);
          d.add(3);
          d.add(4);
          d.add(5);
          d.add(6);
          int[] data=d.getdata();
          int index=d.getIndex();
          for(int i=0;i<index;i++)
          {
        	  
        	  System.out.print(data[i]+" ");
          }
          System.out.println("\n"+d.size());
          d.setValueAt(2, 32);
          for(int i=0;i<index;i++)
          {
        	  
        	  System.out.print(data[i]+" ");
          }
         // d.setValueAt(32,78);
          System.out.println("\n"+d.removeLast());
          index=d.getIndex();
          for(int i=0;i<index;i++)
          {
        	  
        	  System.out.print(data[i]+" ");
          }
          System.out.println("\n"+d.isEmpty());
          System.out.println(d.getElement(1));
          
	}

}
