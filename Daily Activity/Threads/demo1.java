package executor;

/*public static int activeCount()

This method of the thread is used to return the no. of active threads in the currently executing 
thread’s thread group.The number returned by this threading method is only an estimate number 
as the number of threads dynamically changes while this method traverses internal data structures.*/

public class demo1 extends Thread   
{  
    demo1(String threadname, ThreadGroup tg)  
    {  
        super(tg, threadname);  
        start();  
    }  
    public void run()  
    {  
       System.out.println("running thread name is:"+Thread.currentThread().getName());    
    }  
    public static void main(String arg[])  
    {  
        ThreadGroup g1 = new ThreadGroup("parent thread group");  
          demo1 thread1 = new demo1("Thread-1", g1);  
        demo1 thread2 = new demo1("Thread-2", g1);  
          System.out.println("number of active thread: "+ g1.activeCount());  
    }  
}
