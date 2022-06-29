//WAP to perform Constructor Overloading
package executor;

public class Overloading{
	int rollno;
	String name;
	
	Overloading(){      //Default constructor
		System.out.println("Test Overloading");
		
	}
	
	Overloading(int r){   //Parameterized constructor with one argument
		rollno=r;
	
	}
	Overloading(int r,String n){   //Parameterized constructor with two argument
		rollno=r;
		name=n;
	
	}
	void disp() {
		System.out.println("Name of student = "+name);
		System.out.println("Roll no of student = "+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading a = new Overloading();    // Object for default constructor
		Overloading s = new Overloading(21,"Dharshan Amin"); // Objects for parameterized constructor
		a.disp();     // For default constructor
		s.disp();     //For parameterized constructor
		
	}

}
