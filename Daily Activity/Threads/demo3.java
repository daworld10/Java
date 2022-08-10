package executor;

/*public static boolean holdsLock(Object obj)

This thread method checks if the currently executing thread holds the monitor lock on the specified object. 
If it does, then this threading method will return true.*/

public class demo3 implements Runnable   
{  
    public void run()   
    {  
        System.out.println("Currently executing thread is: " + Thread.currentThread().getName());  
        System.out.println("Does thread holds lock? " + Thread.holdsLock(this));  
        synchronized (this)   
        {  
            System.out.println("Does thread holds lock? " + Thread.holdsLock(this));  
        }  
    }  
    public static void main(String[] args)   
    {  
        demo3 g1 = new demo3();  
        Thread thread1 = new Thread(g1);  
        thread1.start();  
    }  
}  
