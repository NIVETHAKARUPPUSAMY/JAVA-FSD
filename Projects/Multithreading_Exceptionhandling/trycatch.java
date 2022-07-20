package Multithreading_Exceptionhandling;

public class trycatch {
    public static void main(String args[]) 
    {
    	int a=5;
    	int b;
    	
    	try
    	{
    		b=5/0;
    	}
    	catch(ArithmeticException ae)
    	{
    		 System.out.println("Arithmetic Exception occurs");
    	}
    	finally
    	{
    		System.out.println("Infinity Occurs");
    	}
        /*int[] array = new int[10];
        try 
        {
            array[12] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index out of bounds error occurs "); 
        }
        finally 
        {
            System.out.println("The array is working);
        }
        */
    }
	

}
