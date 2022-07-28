package Basic_programs;

public class Primitive_types {
	
	public static void main(String[] args)
	  {
	    byte minbytevalue = Byte.MIN_VALUE;
	    byte maxbytevalue = Byte.MAX_VALUE;
	    System.out.println("Min Byte Value " + minbytevalue);
	    System.out.println("Max Byte Value " + maxbytevalue);
	    
	    byte x = Byte.MAX_VALUE;
	    System.out.println(x);
	    
	    short minshortvalue = Short.MIN_VALUE;
	    short maxshortvalue = Short.MAX_VALUE;
	    System.out.println("Min Short Value " + minshortvalue);
	    System.out.println("Max Short Value  " + maxshortvalue);
	    
	    short y = Short.MAX_VALUE;
	    System.out.println(y);
	    
	    System.out.println("Min Integer Value -2147483648");
	    System.out.println("Max Integer Value 2147483647");
	    
	    System.out.println("Min Integer Value -9223372036854775808");
	    System.out.println("Max Integer Value 9223372036854775807");
	    
	    System.out.println("Min Float Value 1.4E-45");
	    System.out.println("Max Float Value 3.4028235E38");
	    
	    System.out.println("Min Double Value 4.9E-324");
	    System.out.println("Max Double Value 1.7976931348623157E308");
	  }

}
