//WAP to test this keyword with instance class variable
package executor;

public class Testthis 
{
	int rollno;
	String name;
	
	
	 Testthis(int roll, String name) {
		
		this.rollno = rollno;      //this keyword refers to current object in method or variable
		this.name = name;
	}
	void display()
	{
		System.out.println("The roll no is = "+rollno+" Name is = "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthis s =new Testthis(21,"Dharshan");
		s.display();
	}

}
