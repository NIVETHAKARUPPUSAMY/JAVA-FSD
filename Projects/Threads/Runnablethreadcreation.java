package Threads;

public class Runnablethreadcreation extends Thread {
    public static int myCount = 0;
    public Runnablethreadcreation() {}
    public void run()
    {
   //Runnable thread
        while(Runnablethreadcreation.myCount <10)
        {
            try{
                System.out.println("Runnable Thread: "+(++Runnablethreadcreation.myCount));
                Thread.sleep(100);
            } 
            catch (InterruptedException ie) 
            {
                System.out.println("Exception in Runnable thread: "+ie.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Runnablethreadcreation mrt = new Runnablethreadcreation();
        Thread t = new Thread(mrt);
        t.start();
       //main thread 
        while(Runnablethreadcreation.myCount <10){
            try
            {
                System.out.println("Main Thread: "+(++Runnablethreadcreation.myCount));
                Thread.sleep(100);
            } 
            catch (InterruptedException ie)
            {
                System.out.println("Exception in main thread: "+ie.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }


}
