//WAP to pass this as argument of method
package executor;

public class Testthis4 
{
	Testthis4(int a)
	{
		System.out.println("This is 1 statement....");
	}
	void display(Testthis4 s) 
	{	
		System.out.println("This is a object....");
	}
	void show() 
	{
		display(this);
		System.out.println("This.....");   //using to call method by passing (this) as argument
	}
	void test() {
		display(this);
		System.out.println("THis is as........"); ////no output will come as we aren't calling it using object
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthis4 s = new Testthis4(10);
		s.show();
	}

}
