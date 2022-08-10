package executor;

/*public final boolean isAlive()

This method checks if the thread is alive. 
A thread is in the alive state if the start() method of thread class has been called 
and the thread has not yet died.*/

public class JavaIsAliveExp extends Thread   
{  
    public void run()  
    {  
        try  
        {  
            Thread.sleep(300);  
            System.out.println("is run() method isAlive "+Thread.currentThread().isAlive());  
        }  
        catch (InterruptedException ie) {  
        }  
    }  
    public static void main(String[] args)  
    {  
        JavaIsAliveExp thread1 = new JavaIsAliveExp();  
        System.out.println("before starting thread isAlive: "+thread1.isAlive());  
        thread1.start();  
        System.out.println("after starting thread isAlive: "+thread1.isAlive());  
    }  
} 
