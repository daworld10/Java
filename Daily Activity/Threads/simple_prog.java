//WAP to show multithreading

package executor;

public class simple_prog implements Runnable  {   // If implement is written then we need to override 
												 // the methods of Runnable
	@Override
	public void run() {							//default method of Thread
		// TODO Auto-generated method stub
		System.out.println("The numbers are :");
		 for(int i=1;i<10;i++)
		 {
			 System.out.println(i);
			 try
			 {
				 Thread.sleep(2000);       //For delay in thread process
			 }
			 catch(InterruptedException e)
			 {
				 e.printStackTrace();   //It is a method of Java's throwable class 
				                       //which prints the throwable along with other details like the line number 
				                      //and class name where the exception occurred
			 }
		 }
		
	}
	
	public static void main(String args[])
	{
		simple_prog obj = new simple_prog();
		simple_prog obj1 = new simple_prog();
		demo2 obj2=new demo2();
		Thread t1=new Thread(obj);			//We need to pass the object of simple_proj in Thread object as
		Thread t2=new Thread(obj1);		   // it is implemented form interface
		Thread t3=new Thread(obj2);
		t1.start();
		t2.start();
		t3.start();
	}
	

}
