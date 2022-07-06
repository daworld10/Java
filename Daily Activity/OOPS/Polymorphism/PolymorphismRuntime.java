//WAP to implement runtime polymorphism
package executor;

class Override
{
	void show()
	{
		System.out.println("Parent class.................");
	}
}

class Overridechild extends Override
{
	void show()
	{ super.show();                         //To call show method of Parent class
		System.out.println("Child class.......");
	}
}
public class PolymorphismRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overridechild s= new Overridechild();
		s.show();
	}

}
// At runtime we dont know which method is executed before compiling