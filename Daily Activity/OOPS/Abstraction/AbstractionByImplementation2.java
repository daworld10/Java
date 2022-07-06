//WAP to implement abstraction using interface method
//Hierarchical inheritance
package executor;

interface First
{
	void display();
}
interface Second extends First
{
	void show();
}
class Inter implements Second
{
	public void display() {
		System.out.println("Implement abstraction.....");
	}
	public void show()
	{
		System.out.println("Implements abstraction2.......");
	}
}
public class AbstractionByImplementation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter s =new Inter();
		s.display();
		s.show();
	}

}
