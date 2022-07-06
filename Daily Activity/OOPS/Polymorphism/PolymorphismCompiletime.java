//WAP to implement compile time polymorphism or static polymorphism 
package executor;
class Testpoly
{
	void show(int a)
	{
		System.out.println("Value of a is = "+a);
	}
	void show(int a ,int b) 
	{
		System.out.println("Value of a is = "+a+" Value of b is = "+b);
	}
}

public class PolymorphismCompiletime {

	public static void main(String[] args) {
		Testpoly s =new Testpoly();
		s.show(9);
		s.show(11,15);
		
		// TODO Auto-generated method stub

	}

}
//At compile time we already know which method will be executed before compiling.