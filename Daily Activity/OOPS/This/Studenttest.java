//WAP to use (this) as a constructor 
package executor;

public class Studenttest 
{	
	int rollno,age;
	String name;
	
	public Studenttest(int rollno, String name) 
	{
		this.rollno = rollno;
		this.name = name;
	}
	
	public Studenttest(int rollno, String name, int age) 
	{
		this(rollno,name);    // this should be written 1 , that means it should be 1 statement
							 // that means it should be written before the constructor body
		this.age = age;
	}
	
	void show() 
	{
		System.out.println(rollno+" "+name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studenttest s =new Studenttest(21,"Dharshan");
		Studenttest s1 =new Studenttest(22,"Amin",21);
		s.show();
		s1.show();
	}

}
