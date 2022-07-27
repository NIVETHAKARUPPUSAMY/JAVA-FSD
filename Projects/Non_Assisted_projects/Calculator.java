package Non_Assisted_projects;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
			
			int a,b;
			Scanner s = new Scanner(System.in);
			  
	        System.out.println("Enter the numbers");
	  
	        // take the inputs
	        a = s.nextInt();
	        b = s.nextInt();
			
	        System.out.println("Select the required operators:  +, -, *, /");
	        
	        //symbol as input
	        
	        char c = s.next().charAt(0);
	        
	        switch(c)
	        {
	        case '+' :System.out.println("a + b = "+ (a+b));
	        			break;
	        case '-' :System.out.println("a - b = "+ (a-b));
	    				break;
	    	case '*' :System.out.println("a * b = "+ a*b);
	    				break;
	    	case '/' :System.out.println("a / b = "+ a/b);
	    				break;
	    	default:System.out.println("You enter wrong input");
	    				break;
	        }	        	
	   }
}
