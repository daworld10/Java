package executor;

class Parent1
{	
		int a =10;
}
class Child1 extends Parent1
{ 
	int a=20;
	void display()
	{
			System.out.println(super.a);
	}
}
public class Super2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child1 s =new Child1();
		s.display();

	}

}
