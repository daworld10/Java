
//Program to test throw keyword
package executor;
public class ThrowTest {
	int age;
	int weight;
	static void eligible(int age,int weight)
			
			{
		if (age<18 && weight<40) {
			throw new ArithmeticException("Not Eligible for voting");
		}
		else {
			System.out.println("You are eligible for voting...");
		}
	}
	public static void main(String[] args) 
	{
		eligible(20,40);
	}
}