package Practise_Projects;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Map {
public static void main(String[] args) {
		
		Random random=new Random();
		Set<Integer> myset=new HashSet<>();
		for(int i=0;i<5;i++)
		{
			Integer randomnumber=random.nextInt(100);
			System.out.println(randomnumber);
			myset.add(randomnumber);
		}
		
		System.out.println("HASH SET ELEMENTS :"+myset);
	
	
	myset=new LinkedHashSet<>();
	for(int i=0;i<5;i++)
	{
		Integer randomnumber=random.nextInt(100);
		System.out.println(randomnumber);
		myset.add(randomnumber);
	}
	System.out.println("Linked HASH SET ELEMENTS :"+myset);
	
	//ASCENDING ORDER VALUES
	 myset=new TreeSet<>();
		for(int i=0;i<5;i++)
		{
			Integer randomnumber=random.nextInt(100);
			System.out.println(randomnumber);
			myset.add(randomnumber);
		}
		System.out.println("TREE SET ELEMENTS :"+myset);
	
	//Ascending order strings
	
	Set<String> names = new TreeSet<>();
	names.add("xyz");
	names.add("abc");
	names.add("hij");
	names.add("def");
	System.out.println("Treeset names: " + names);
	}

}
