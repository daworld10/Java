//WAP to copy the values of one object into another by assigning the values of one object to another
package executor;

public class Copycontest2
{
	int rollno;
	String name;
	
	Copycontest2(int r , String n) //Parameterized constructor have 2 parameters
	{
		rollno=r;
		name=n;	
	}

	Copycontest2()   // Default constructor
	{
		
	}
	void showCopy()
	{
		System.out.println("The roll no. is = "+rollno+" Name is = "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copycontest2 c =new Copycontest2(21,"Dharshan Amin");
		Copycontest2 c1=new Copycontest2();
		c1.rollno=c.rollno;
		c1.name=c.name;
		c.showCopy();
		c1.showCopy();
	}

}
