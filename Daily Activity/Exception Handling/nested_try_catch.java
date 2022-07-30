package executor;
import java.util.Scanner;

public class nested_try_catch {

	int num1,num2,res;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nested_try_catch s = new nested_try_catch();
		s.process();
	}
	
	public void process()
	{
		try
		{
			System.out.println("Enter two numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			res=num1/num2;
			System.out.println("The div is ="+res);
			try
			{
				int[] num=new int[10];
				System.out.println("Enter the number for array");
				num[10]=sc.nextInt();
				System.out.println("Array is ="+num[10]);
			}
			catch(ArrayIndexOutOfBoundsException ar)
			{
				System.out.println("The Exceptrion on array");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}