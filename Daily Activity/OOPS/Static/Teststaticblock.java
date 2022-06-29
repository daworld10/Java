//WAP to test static as a block
package executor;

public class Teststaticblock 
{	
	static  //static block
	{
		System.out.println("Executes..........");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Executes main");
	}

}


//till jdk 1.6
//Static block is executed before the main method .
//But we always require a main method to execute it
