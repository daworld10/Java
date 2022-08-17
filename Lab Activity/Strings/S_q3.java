/*Write a program to accept a string from the user and accept a character from the user
and remove all occurrences of a given character from input String.*/

package executor;

import java.util.Scanner;

public class S_q3 
{
	public static void input()
	{
		System.out.println("Please Enter your Name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Please enter the character you want to remove");
		char c = sc.next().charAt(0);
		remove(name,c);
		}
	
	public static void remove(String name,char c)
	{	 
		int count = 0;
		char []t = name.toCharArray();
		for (int i = 0; i < name.length(); i++)
	    {
			for(int j=0; j<name.length();j++)
			{
	        if (t[i] != c)
	        t[j++] = t[i];
	        else
	            count++;
	    }
	     
	    while(count > 0)
	    {
	        t[j++] = '0';
	        count--;
	    }
	    }
	     
	    System.out.println(t);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
