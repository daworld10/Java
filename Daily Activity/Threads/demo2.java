//Demo2 class for simple_prog(multiple thread or multithreading)
package executor;

public class demo2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("From demo2 class :");
		for(int j=1;j<10;j++)
		{
			System.out.println(j);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e1)
			{
				e1.printStackTrace();
			}
		}
	}
}
