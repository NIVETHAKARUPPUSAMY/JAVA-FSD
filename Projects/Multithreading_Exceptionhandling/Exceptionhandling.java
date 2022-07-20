package Multithreading_Exceptionhandling;

public class Exceptionhandling extends Exception{
	   String str1;
	   Exceptionhandling(String str2)
	   {
		str1=str2;
	   }
	   public String toString()
	   { 
		return ("My Exception Occurred: "+str1) ;
	   }
	}
	
	



