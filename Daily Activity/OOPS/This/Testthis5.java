//WAP to pass (this) as a agrument in the constructor
package executor;

public class Testthis5    //1st class
{
	Testthis6 s2;
	Testthis5(Testthis6 s2)
	{
		this.s2=s2;
	}
	void display() 
	{
		System.out.println(s2.a);      //accessing value of 2 class using object of 2 class
	}
}
class Testthis6     //2nd class 
{
	int a =10;
	Testthis6()  //Default constructor
	{
		Testthis5 s1 =new Testthis5(this);  //this is passed as argument
		s1.display();						//Object of 1 class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testthis6 s = new Testthis6();	   //object of 2 class
		}

}
