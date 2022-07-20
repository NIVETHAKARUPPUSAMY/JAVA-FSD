package Multithreading_Exceptionhandling;

public class Exceptionhandling1 {
		   public static void main(String args[]){
			try
			{
				System.out.println("Starting of try block");
				throw new Exceptionhandling("This is My error Message");
			}
			catch(Exceptionhandling exp)
			{
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }

}
