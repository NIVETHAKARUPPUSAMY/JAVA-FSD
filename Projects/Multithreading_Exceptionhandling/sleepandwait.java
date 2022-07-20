package Multithreading_Exceptionhandling;

public class sleepandwait {
    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
    	System.out.println("The current thread name is :"+Thread.currentThread().getName());
        Thread.sleep(10000);
        
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 10 second");
        synchronized (LOCK) 
        {
        	System.out.println("The current Lock name is "+LOCK);
            LOCK.wait(10000);
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 10 second");
        }
    }


}
