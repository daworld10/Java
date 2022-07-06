package executor;

public class Arithematic{
	void add(int a,int b) {
		System.out.println("Sum of 2 is :"+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("Sum of 3 is :"+(a+b+c));
	}
	void subtract(int a,int b) {
		System.out.println("Subtraction of 2 is :"+(a-b));
	}
	void subtract(int a,int b,int c) {
		System.out.println("Subtraction of 3 is :"+(a-b-c));
	}
	void multiply(int a,int b) {
		System.out.println("Multiplication of 3 is :"+(a*b));
	}
	void multiply(int a,int b,int c) {
		System.out.println("Multiplication of 3 is :"+(a*b*c));
	}
	void divison(int a,int b) {
		System.out.println("Division of 2 is :"+(a/b));
	}
	void divison(int a,int b,int c) {
		System.out.println("Division of 3 is :"+((a/b)/c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithematic s = new Arithematic();
		s.add(10, 20,30);
		s.subtract(100, 20,30);
		s.multiply(10, 20,30);
		s.divison(10,20,30);

	}

}