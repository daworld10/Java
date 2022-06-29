//WAP to perform MethodOverloading with static
package executor;

public class MethodOverload {  
	 static int sum(int number1,int number2)   //Mentioned static because printing down is static
	{
		return number1+number2;
	}
	 static int sum(int number1,int number2,int number3)
	{
		return number1+number2+number3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(MethodOverload.sum(11,15));  // Object not required for Static
	System.out.println(MethodOverload.sum(11,15,17));
	}

}
