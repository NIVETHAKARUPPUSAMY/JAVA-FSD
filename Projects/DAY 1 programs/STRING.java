
public class STRING {
	public static void main(String[] args) {
		
	String s="Hello World";
	String s1="HeloWorld";
	String s2="";
	System.out.println(s);
	//String length
	System.out.println(s.length());
	// Substring
	System.out.println(s.substring(2));
	//Compare tow string
	System.out.println(s.compareTo(s1));
	//is empty or not
	System.out.println(s2.isEmpty());
	System.out.println(s.isEmpty());
	//To lower case
	System.out.println(s.toLowerCase());
	//to upper case
	System.out.println(s.toUpperCase());
	//equals
	System.out.println(s.equals(s1));
	
	//creating Stringbuffer and append method
	
	StringBuffer s11=new StringBuffer("GOOD MORNING");
	s11.append("Welcome to Java");
	System.out.println(s11);
	
	//insert method
	s11.insert(3, 'h');
	System.out.println(s11);
	
	//replace method
	s11.replace(0,4,"howa");
	System.out.println(s11);
	
	//string builder
	StringBuilder sb=new StringBuilder("Good ");
	sb.append("Morning");
	System.out.println(sb);

	System.out.println(sb.delete(0, 1));

	System.out.println(sb.insert(1, "Welcome"));

	System.out.println(sb.reverse());
	
	
	//conversion of Strings to StringBuffer and StringBuilder
			
	String str = "Hello"; 
	        
	// conversion from String object to StringBuffer 
	StringBuffer sbr = new StringBuffer(str); 
	sbr.reverse(); 
	System.out.println("String to StringBuffer");
	System.out.println(sbr); 
	          
	// conversion from String object to StringBuilder 
	StringBuilder sbl = new StringBuilder(str); 
	sbl.append("world"); 
	
	System.out.println("String to StringBuilder");
	System.out.println(sbl);              		
	}	
}


