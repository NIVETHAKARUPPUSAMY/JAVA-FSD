package Practise_Projects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection{
	
	public static void main(String[] args) {
		
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> name=new ArrayList<String>();   
	    name.add("hello");//
	    name.add("World");    	   
        System.out.println(name);  
		
		//creating vector
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
		//creating linkedlist
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Good");  
	      names.add("Morning");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(1);  
	       set.add(2);  
	       set.add(3);
	       set.add(4);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();  
	       set1.add(11);  
	       set1.add(12);  
	       set1.add(13);
	       set1.add(14);	       
	       System.out.println(set1);
	      	} 
	      }  


}
