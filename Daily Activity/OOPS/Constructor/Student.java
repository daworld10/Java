package executor;

public class Student {
	int rollno;
	String name;
	
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	void disp() {
		System.out.println("Name of student = "+name);
		System.out.println("Roll no of student = "+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(21,"Dharshan Amin");
		s.disp();
	}

}
