import java.util.LinkedList;
import java.util.List;
public  class LinkedList1  {
	     	
 public static void main(String[] args) 
	    	{ 
	 		List<Integer>linkedList=new LinkedList();
			linkedList.add(1);
			linkedList.add(2);
			linkedList.add(3);
			linkedList.add(4);
			linkedList.add(5);
			linkedList.add(6);
			linkedList.add(7);
			linkedList.add(8);
			System.out.println(linkedList);
	        
			//REMOVE VALUE USING INDEX
			linkedList.remove(2);
			System.out.println(linkedList);
			
			//REMOVE VALUE USING VALUE
			linkedList.remove(new Integer (6));
			System.out.println(linkedList);
	        		
	    	} 
} 



