//WAP to apply static with variable
package executor;

public class Teststatic 
{
	 static int a=1;
	
	Teststatic()
	{ 
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teststatic s =new Teststatic();
		Teststatic s1 =new Teststatic();
		Teststatic s2 =new Teststatic();
		
	}

}


//Value changes for every (a)...it searches memory and updates
