package Basic_programs;

public class While_DoWhile_Loop {
	
	public static void main(String[] args)
	  {
	    int i = 1;
	    while (i <= 10)
	    {
	      System.out.println(i);
	      i++;
	    }
	    for (i = 1; i <= 10; i++)
	    {
	      for (int j = 1; j <= i; j++) {
	        System.out.print("*");
	      }
	      System.out.println(i);
	    }
	  }

}
