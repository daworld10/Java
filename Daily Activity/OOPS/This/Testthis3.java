//WAP to test (this) constructor by calling default constructor from parameterized constructor
package executor;

public class Testthis3 
{
	int a;
	
	public Testthis3()                // Default constructor
	{	
		//this(10);       <<-------------- When you want to call the parameterized constructor
											//and remove the this keyword from parameterized constructor
	
		// TODO Auto-generated constructor stub
		System.out.println("Default body................");
	}


	public Testthis3(int a) 		//Parameterized constructor
	{ 	this();             // USing this keyword to call the default constructor
		this.a = a;
		System.out.println("Para body............ = "+a);
		
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Testthis3 s =new Testthis3();
	}

}
