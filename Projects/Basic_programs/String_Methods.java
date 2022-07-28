package Basic_programs;

public class String_Methods {
	
	public static void main(String[] args)
	  {
	    String s = "Hello World";
	    System.out.println(s);
	    
	    System.out.println("Length = " + s.length());
	    
	    System.out.println("Character at 3 = " + s.charAt(3));
	    
	    System.out.println("Command after exception");
	    
	    System.out.println("Index of W = " + s.indexOf('W'));
	    System.out.println("Index of L = " + s.indexOf('l'));
	    System.out.println("Index of second L = " + s.indexOf('l', 3));
	    System.out.println("Index of third L = " + s.indexOf('l', 4));
	    System.out.println("Index of space : " + s.indexOf(" "));
	    
	    System.out.println("Substring = " + s.substring(3));
	    System.out.println("Substring of llowor = " + s.substring(2, 9));
	    
	    String[] s3 = s.split("o");
	    System.out.println("No of derived words: " + s3.length);
	    System.out.println(s3[0]);
	    System.out.println(s3[1]);
	    System.out.println(s3[2]);
	    
	    System.out.println("Replaced : " + s.replace("l", "j"));
	    
	    System.out.println("Uppercase " + s.toUpperCase());
	    System.out.println("Lowercase " + s.toLowerCase());
	  }
}
