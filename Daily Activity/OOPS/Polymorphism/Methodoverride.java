//WAP a program to perform method override
package executor;

class Parent2
{	
	 private void show()  //override in child class      
													
	{													
		System.out.println("Parent class .....");
	}
}
class Child2 extends Parent2
{
	public void show()   								
	{												
		System.out.println("Child class .....");	
	}
}

public class Methodoverride
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 s = new Child2();
		s.show();
	}

}
//public - public          possible
//protected - public       possible
//protected - protected    possible
//private - public         possible
//private - protected      possible
