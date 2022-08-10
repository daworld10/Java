package executor;

/*public final void setName()

This method changes the name of the thread.*/

public class SetNameExample extends Thread  
{    
    public void run()  
    {    
        System.out.println("running...");    
    }    
    public static void main(String args[])  
    {   
        SetNameExample thread1=new SetNameExample();    
        SetNameExample thread2=new SetNameExample();    
        thread1.start();    
        thread2.start();       
        thread1.setName("Dharshan");    
        thread2.setName("Amin");  
        System.out.println("After changing name of thread1: "+thread1.getName());  
        System.out.println("After changing name of thread2: "+thread2.getName());  
    }    
}