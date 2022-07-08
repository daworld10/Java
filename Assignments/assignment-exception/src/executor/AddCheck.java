package executor;
import java.util.Scanner;
public class AddCheck {
	static void add(int a,int b)
	{	int sum = a+b;
		try 
		{
			if(sum<100)
			{
				System.out.println("Sum of numbers are = "+sum);
			}
			else
			{
				throw new ArithmeticException("Greater than 100");
			}
		}
		finally 
		{
			System.out.println("Done");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The numbers");
		int a1 = sc.nextInt();
		int b1=sc.nextInt();
		add(a1,b1);
	}
	

}
