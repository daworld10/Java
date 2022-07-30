package executor;

public class thread_demo extends Thread {   //No need of overriding the methods of Thread
											// Thread is by default super class
	
	public void run()
	{
		System.out.println("This is run method");   // default method of Thread
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread_demo obj = new thread_demo();    // No need of creating object of Thread class
		obj.start();						   //and passing the object of thread_demo class in it
											  //as it is inheriting form default Thread class
		  					                 //The start method will execute the run method of Thread class
	}

}
