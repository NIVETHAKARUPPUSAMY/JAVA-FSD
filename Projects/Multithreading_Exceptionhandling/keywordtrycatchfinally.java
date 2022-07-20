package Multithreading_Exceptionhandling;

import java.util.*;

public class keywordtrycatchfinally {
	
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	int a= sc.nextInt();
	int b=0;
	try
	{
	if(a/b==0)
	{
		System.out.println("Even number");
	}
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Arithmetic Exception Error occurs");
	}
	finally
	{
		System.out.println("Fianlly block executed");
	}
	}
}
