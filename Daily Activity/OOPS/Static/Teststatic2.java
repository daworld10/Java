//WAP to test static variables
package executor;
// Create class
public class Teststatic2 
{
	//Declare main method
	int rollno;
	 String studentname;
	static String collegename="Oxford";
	static void change()
	{
		collegename="Manipal";
	}
	 Teststatic2(int r , String sname) 
	{
		rollno=r;
		studentname=sname;
		
	}
	void display() 
	{
		System.out.println("The roll no is = "+rollno+" Name is = "+studentname+" The college name is = "+collegename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		Teststatic2  s =new Teststatic2 (21,"Dharshan");
		Teststatic2  s1 =new Teststatic2(22,"Amin");
		//s.change()
		Teststatic2.change();   //Class calling
		s.display();
		s1.change();            //Object calling
		s1.display();
		

	}

}
