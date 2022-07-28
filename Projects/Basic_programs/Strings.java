package Basic_programs;

public class Strings {
	
	public static void main(String[] args)
	  {
	    String name = "Max William";
	    
	    String s2 = new String("Something");
	    
	    char[] c = { 'h', 'e', 'l', 'l', 'o' };
	    String s3 = new String(c);
	    
	    byte[] b = { 65, 66, 67 };
	    String s4 = new String(b);
	    
	    System.out.println("Name : " + name);
	    System.out.println("length of Name : " + name.length());
	    
	    System.out.println(s3);
	    System.out.println(s2);
	    System.out.println(s4);
	  }

}
