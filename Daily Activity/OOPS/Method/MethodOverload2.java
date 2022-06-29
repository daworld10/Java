//WAP to perform MethodOverloading without static
package executor;

public class MethodOverload2 {  
	 int sum(int number1,int number2)
	{
		return number1+number2;
	}
	 int sum(int number1,int number2,int number3)
	{
		return number1+number2+number3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MethodOverload2 s =new MethodOverload2();  // Object created because not static not mentioned
	System.out.println(s.sum(11,15));
	System.out.println(s.sum(11,15,17));
	}

}
