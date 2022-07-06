//WAP to read a number and check whether it is positive negative or zero
package executor;
import java.util.Scanner;


public class NumberCheck 
{	static int number;
	
	void checking(int n)
	{
		number=n;
		if(n==0)
		{
			System.out.println("Number is Zero");
		}
		else if(n>0)
		{
			System.out.println("Number is Positive");
		}
		else if (n<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Please enter valid number");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCheck s =new NumberCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number = ");
		 number = sc.nextInt();
		s.checking(number);
		
	}

}
