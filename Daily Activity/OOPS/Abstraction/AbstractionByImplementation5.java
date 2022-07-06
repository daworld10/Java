package executor;

interface Calculate
{
	void area();
	default void area2(int r)
	{
		System.out.println("Area of square = "+r*r);   //Defining a method using default 
	}
}

class Rect1 implements Calculate
{
	private int a,b;
	private int area1;
	public Rect1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void area()
	{
		System.out.println("Area of Rectangle = "+a*b);
	}
	
}

public class AbstractionByImplementation5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect1 s=new Rect1(2,3);
		s.area();
		s.area2(9);   //Calling defined method
	} 

}
