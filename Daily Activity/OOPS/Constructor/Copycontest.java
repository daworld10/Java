//WAP to copy the values of one object into another using constructor
package executor;

public class Copycontest 
{
	int rollno;
	String name;
	
	Copycontest(int r , String n) //Parameterized constructor having 2 parameters
	{
		rollno=r;
		name=n;	
	}

	Copycontest(Copycontest c)
	{
		rollno=c.rollno;
		name=c.name;
	}
	void showCopy()
	{
		System.out.println("The roll no. is = "+rollno+" Name is = "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copycontest c =new Copycontest(21,"Dharshan Amin");
		Copycontest c1=new Copycontest(c);
		c.showCopy();
		c1.showCopy();
	}

}
