package executor;

import java.util.Scanner;

public class excep_Demo {
	
	int num1,num2,res;
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		excep_Demo s = new excep_Demo();
		s.process();
	}
	public void process()
	{
		try
		{
			System.out.println("Enter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res = num1 + num2;
			System.out.println("The add is :"+res);
			res = num1 - num2;
			System.out.println("The sub is :"+res);
			res = num1 * num2;
			System.out.println("The mul is :"+res);
			res = num1 / num2;
			System.out.println("The div is :"+res);
			res = num1 % num2;
			System.out.println("The mod is :"+res);
			int[] arr=new int[5];
			System.out.println("enter the numbers");
			arr[5]=sc.nextInt();
			System.out.println("The array value of 5th location is = "+arr[5]);
			String name=null;
			System.out.println("The length is ="+name.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("The name is containing the null kind value ");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("MSG "+ae.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("The second number cannot be zero"+ e.getMessage());
		}
		finally
		{
			System.out.println("The final block");
		}
	}

}
