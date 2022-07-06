//WAP to implement multiple inheritance using Interface
package executor;

interface First
{
	void show();
	
}
interface Second
{
	void show();
}
class MultipleInheritanceUsingInterface implements First,Second {
	public void show()
	{
		System.out.println("Implements.....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceUsingInterface s =new MultipleInheritanceUsingInterface();
		s.show();

	}

}
