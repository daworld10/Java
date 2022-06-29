package executor;

public class Testthis2 
{
	void show()
	{
		System.out.println("Test this for method....");
		
	}
	
	void output() 
	{
		show();     //if the this keyword is not used over here the compiler automatically use this keyword.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthis2 s =new Testthis2 ();
		s.output();
	}

}
