package Multithreading_Exceptionhandling;

public class Threadreceive extends Thread{
	
	private String msg; 
    private Thread t; 
    Threadsynchronization  threadsynchronization; 
    Threadreceive (String m,  Threadsynchronization obj) 
    { 
        msg = m; 
        threadsynchronization = obj; 
    } 
  
    public void run() 
    {  
        synchronized(threadsynchronization) 
        { 
        	threadsynchronization.send(msg); 
        } 
    } 


}
