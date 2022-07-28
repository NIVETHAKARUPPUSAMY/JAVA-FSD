package Basic_programs;

public class Type_casting {
	
	public static void main(String[] args)
	  {
	    int i1 = 10;
	    byte b1 = 12;
	    System.out.println("int value " + i1);
	    System.out.println("byte value " + b1);
	    
	    i1 = b1;
	    
	    System.out.println(i1);
	    
	    i1 = 17;
	    b1 = 9;
	    
	    System.out.println(b1);
	    
	    b1 = (byte)i1;
	    
	    System.out.println(b1);
	    
	    byte xb1 = 2;
	    
	    byte xb2 = 3;
	    
	    byte result = (byte)(xb1 + xb2);
	    System.out.println(result);
	  }

}
