
package executor;
import java.util.Scanner;
public class String_demo1 {
	public static void disp() 
	{
		String name="Dharshan";
		String n1= new String("Demo purpose");
		System.out.println("Value is : "+name);
		System.out.println("String passe : "+n1);
		name+=" Amin";
		System.out.println("Value is : "+name);
	}
	public static void input()
	{
		String n1;
		System.out.println("Please enter another name :");
		Scanner sc = new Scanner(System.in);
		n1=sc.nextLine();
		repall(n1);
	}
	public static void repall(String val)
	{
		String exp="d";
		String newval=val.replace(exp," ");
		String new1=val.replace('d', '9');
		System.out.println("Val="+newval);
		System.out.println("Val="+new1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			disp();
			input();
	}

}
