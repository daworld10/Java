//WAP to print Fibonacci series
package executor;
public class Fibonacci {
	void show(int x) {
		int a=0;
		int b=1;
		if (x==1) {
			System.out.println(+a);
		}
		else {
			System.out.print(+a+" ");
			System.out.print(+b+" ");
			int c=0;
			for (int i =2;i<=x;i++) {
				c = a+b;
				System.out.print(+c+" ");
				a=b;
				b=c;
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci t = new Fibonacci();
		t.show(10);

	}

}