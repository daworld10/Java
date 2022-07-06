//WAP to perform Abstraction using Interface method
package executor;

interface MyInterface
{
	void display();
	void show();
}
class My implements MyInterface
{
	public void display() 
	{
		System.out.println("Method defined1.....");
	}
	
	public void show() {
		System.out.println("Method defined2.......");
	}
}
class Bye implements MyInterface
{
	public void display()
	{
		System.out.println("\nMethod defined3....... ");
	}
	public void show() {
		System.out.println("Method defined4.......");
	}
}
public class AbstractionByImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My s =new My();
		s.display();
		s.show();
		Bye s1=new Bye();
		s1.display();
		s1.show();
	}

}
//
//To implement 100% abstraction
// Interface is same like class but actually its not class
//We use keyword interface
//Methods don't have body there we can implement in the class only
//The class that implements the interface only that class should define the methods
//the methods are abstract
//it may be variable by default they are public static and final