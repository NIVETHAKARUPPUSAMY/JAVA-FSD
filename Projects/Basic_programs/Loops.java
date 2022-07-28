package Basic_programs;

public class Loops {
	public static void main(String[] args)
	  {
	    for (int i = 0; i < 10; i++) {
	      System.out.println("HI ++: " + i);
	    }
	    for (int j = 10; j > 0; j--) {
	      System.out.println("HI --: " + j);
	    }
	    for (int k = 1; k < 10; k += 2) {
	      System.out.println("HI +2: " + k);
	    }
	    for (int k = 1; k <= 10; k++) {
	      for (int l = 1; l <= k; l++) {
	        System.out.print("*");
	      }
	    } System.out.println("");
	  }
}