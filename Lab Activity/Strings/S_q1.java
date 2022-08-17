/*Q1)Write a program to accept full name form the user and display the abbreviations of the first 
and middle names except the last name which is displayed as it is. EG: Name:Manoj Rakesh Gupta  . (M.R.Gupta)*/

package executor;
import java.util.Scanner;

public class S_q1 {
	String name;
	public void input() {
		System.out.println("Please Enter your Name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		this.name=name;
	}
	public  void display()
	{
		System.out.println("Name = "+name);
		String[] arr = name.split(" ",3);
        System.out.println("Short Form Name : "+arr[0].charAt(0)+" "+arr[1].charAt(0)+" "+arr[2]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S_q1 s =new S_q1();
		s.input();
		s.display();
	}

}
