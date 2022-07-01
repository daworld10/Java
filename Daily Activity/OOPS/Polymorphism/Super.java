//WAP a program to perform method override......polymorphism 
package executor;

class Parent 
{	
	 public Parent()   
													
	{		//super() from parent;        //we can write super or isn't required, it is by default											
		System.out.println("Parent class .....");
	}
}
class Child extends Parent 
{
	public Child()  								
	{												
		System.out.println("Child class .....");	
	}
}

public class Super
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child s = new Child();
	}

}
//public - public          possible
//protected - public       possible
//protected - protected    possible
//private - public         possible
//private - protected      possible
