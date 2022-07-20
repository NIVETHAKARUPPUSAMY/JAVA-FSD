package Multithreading_Exceptionhandling;

public class Threadscreation extends Thread {
	
	 	public void run()
	 	{
	  		System.out.println("Thread is running");
	}
	 	public static void main( String args[] )
	 	{
	 		Threadscreation mt = new  Threadscreation();
	  		mt.start();
	 	}
	
}


