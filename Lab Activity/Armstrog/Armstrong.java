//WAP to check Armstrong number

package executor;
import java.util.Scanner;
public class Armstrong {
	 static int number;
	
	void calculate(int n) 
	{
		number = n;
		int temp=n;
		double rem=0,sum=0;
		while(n!=0) 
		{
			rem=n%10;
			sum=sum+Math.pow(rem,3);
			n=n/10;
		}
	if (sum==temp)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong Number");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		number=sc.nextInt();
		Armstrong s =new Armstrong();
		s.calculate(number);
	}	

}
