package ThreadSynchronization;

public class Syncingthreads  {
    public static void main(String args[]) 
    { 
    	Threadsynchronization snd = new Threadsynchronization(); 
        Threadreceive S1 = new Threadreceive( "Running method 1 " , snd ); 
        Threadreceive S2 = new Threadreceive( " Running method 2 " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 


}
