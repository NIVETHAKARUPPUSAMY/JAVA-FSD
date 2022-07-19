import java.util.*;

public class MAP {
	public static void main(String[] args) {
	
		//Hashmap
		
		  HashMap<Integer,String> hashm=new HashMap<Integer,String>();      
		  hashm.put(1,"HI");    
		  hashm.put(2,"GOOD");    
		  hashm.put(3,"MORNING");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hashm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> hasht=new Hashtable<Integer,String>();  
	      
	      hasht.put(4,"AAAA");  
	      hasht.put(5,"BBBB");  
	      hasht.put(6,"CCCC");  
	      hasht.put(7,"DDDD");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:hasht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();    
	      tmap.put(8,"ABBAA");    
	      tmap.put(9,"ABCCABC");    
	      tmap.put(10,"AABBCCED");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:tmap.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  


}
