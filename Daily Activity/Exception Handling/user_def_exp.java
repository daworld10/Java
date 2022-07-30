package executor;

import java.util.Scanner;

public class user_def_exp {

	int num;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		user_def_exp obj=new user_def_exp();
		obj.demo();
		
	}
	public void even_odd(int num) throws dha_demo
	{
		if(num%2==0)
		{
			throw new dha_demo("Even");
		}
		else
		{
			throw new dha_demo("Odd");
		}
	}
	
	public void demo()
	{
		try
		{
			System.out.println("Enter a number");
			num=sc.nextInt();
			even_odd(num);
		}
		catch(dha_demo p)
		{
			System.out.println("MSG="+p.getMessage());
		}
	}

}
