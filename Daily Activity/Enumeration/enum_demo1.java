package executor;
import java.util.Scanner;
public class enum_demo1 
{
	public void display()
	{
		numb n1 =null;
		Scanner sc =new Scanner(System.in);
		try
		{
		System.out.println("Enter the name :");
		String name = sc.nextLine();
		System.out.println("The percentage is "+n1.valueOf(name).get_res());
		}
		catch(Exception e)
		{
			numb n3[]= numb.values();
			System.out.println("Please enter valid name. \nThe records are");
			for(int i=0;i<n3.length;i++)
			{
				System.out.println(n3[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enum_demo1 s =new enum_demo1();
		s.display();
	}

}
