package ThreadSynchronization;

import java.util.*;
import java.io.*;

public class Threadsynchronization {
	
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println( msg + "Sent"); 
        System.out.println(""); 
    } 
}