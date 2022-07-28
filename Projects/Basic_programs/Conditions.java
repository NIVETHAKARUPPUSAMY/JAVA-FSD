package Basic_programs;

import java.io.PrintStream;

public class Conditions {
	
	public static void main(String[] args)
	  {
	    boolean isAliean = false;
	    if (isAliean) {
	      System.out.println("it is an alien");
	    }
	    if (!isAliean) {
	      System.out.println("it is NOT an alien");
	    }
	    String name = "max";
	    if (name == "max") {
	      System.out.println("Correct name");
	    }
	    boolean x = true;
	    boolean y = false;
	    if ((x) && (y)) {
	      System.out.println("Both Conditions are true");
	    } else if (x) {
	      System.out.println("Only X is true");
	    } else {
	      System.out.println("Only Y is true");
	    }
	    System.out.println("");
	    int a = 10;
	    int b = 5;
	    int c = 20;
	    
	    System.out.println("a<b= " + (a < b));
	    System.out.println("a<b and a<c= " + ((a < b) && (a < c)));
	    System.out.println("a<b and a<c= " + ((a < b ? 1 : 0) & (a < c ? 1 : 0)));
	    
	    System.out.println("a<b and a<c= " + ((a < b) && (++a < c)));
	    System.out.println("A after logical and = " + a);
	    a++;System.out.println("a<b and a<c= " + ((a < b ? 1 : 0) & (a < c ? 1 : 0)));
	    System.out.println("A after bitwise and = " + a);
	    
	    System.out.println("");
	   /* boolean mybool = false;
	    if ((mybool = 0) != 0) {
	      System.out.println("X");
	    } else {
	      System.out.println("Y");
	    }*/
	  }
}
