//WAP to implement abstraction using interface method

//Multiple inheritance which can be only implemented using only Interface method
package executor;

interface First1
{
	void display();
}
interface Second1
{
	void show();
}
interface Third extends First1,Second1
{
	void inpout();
}

public class AbstractionByImplementation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third s = new Third()
				{
			public void display()
			{
				}

			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void inpout() {
				// TODO Auto-generated method stub
				
			}
			
				};
				s.display();
				s.show();
				s.inpout();
				
				
	}
}



