//WAP to check Palindrome number
package executor;
import java.util.Scanner;
public class Palindrome
{
														// recursive function that
														// returns the reverse of digits
	static int rev(int n, int temp)
	{
		if (n == 0)
		{ 
			return temp;
		
		}
		else												// stores the reverse
		{												// of a number
		temp = (temp * 10) + (n % 10);
		return rev(n / 10, temp);
		}
}
 

public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number = ");
    int n= sc.nextInt();
    int temp = rev(n, 0);
     
    if (temp == n)
        System.out.println("It is a Palindrome number");
    else
        System.out.println("It is not a Palindrome number" );
}
}