package executor;
public class EmployeeSalary {
	String name;
	int id, salary;
	double bs,da,hra,ta,pf,gs;
	
	void input(String name,int id, int salary) {
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	
	void compute() {
		bs=salary;
		da=bs*0.15;
		hra=bs*0.10;
		ta=bs*0.08;
		pf=bs*0.05;
		gs = bs+da+hra+ta-pf;
	}
	void display() {
		System.out.println("ID = "+id);
		System.out.println("Name = "+name);
		System.out.println("Basic Salary = "+bs);
		System.out.println("Dearness Allowance = "+da);
		System.out.println("House rate allowance = "+hra);
		System.out.println("Travel Allowance = "+ta);
		System.out.println("Provident Fund = "+pf);
		System.out.println("Gross Salary = "+gs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSalary s = new EmployeeSalary();
		s.input("Dharshan Amin", 17, 900000  );
		s.compute();
		s.display();
	}

}
