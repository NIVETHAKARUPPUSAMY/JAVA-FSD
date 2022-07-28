package Basic_programs;

public class Ternary_Operator {
	
	public static void main(String[] args)
	  {
	    int age = 20;
	    boolean haslicence = true;
	    
	    boolean canDrive = age > 18;
	    boolean canrentcar = haslicence;
	    
	    System.out.println("Age= " + age);
	    System.out.println("Has licence ?" + haslicence);
	    System.out.println("Can drive?" + canDrive);
	    System.out.println("Can rent a car?" + canrentcar);
	    
	    System.out.println("");
	    
	    String result = canDrive ? "no licence can't drive" : haslicence ? "has licence and can drive" : "cannot drive";
	    System.out.println(result);
	    
	    System.out.println("");
	    
	    int agevote = 16;
	    boolean hasvote = false;
	    boolean havevoteid = false;
	    
	    String voting = agevote >= 18 ? "havevote" : "novote";
	    System.out.println(voting);
	    
	    voting = agevote >= 18 ? "have no vote id" : havevoteid ? "have voteid" : "cannot vote";
	    System.out.println(voting);
	  }

}
