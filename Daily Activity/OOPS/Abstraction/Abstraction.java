//WAP to perform Abstraction using abstract method
package executor;

abstract class TestAbstract 	//Abstract class
{		
	abstract void display();    //Abstract class always contains atleast 1 abstract method
	void show() 
	{
		System.out.println("Implement abstraction........");
	}
	
}
class Childclass extends TestAbstract
{
	 void display() {								//Cannot mention abstract void display() as class defined
		System.out.println("Override method.....");	// is not abstract
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childclass s = new Childclass();
		s.display();
		s.show();
	}

}
//We implement abstraction partially 0 to 100
