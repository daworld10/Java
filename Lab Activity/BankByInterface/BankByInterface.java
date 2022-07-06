//Create one interface Bank and try to implement method rate of interest in different banks 
//and try to implement abstraction using interface 
package executor;
interface Bank
{
	void rate();
	void calculate();
	default void name(String n)
	{
		System.out.println("The name of bank is = "+n);
	}
	
}

class Bank1 implements Bank
{
	private int r,time;
	private double interest;
	Bank1(double interest,int r,int time)
	{
		super();
		this.r=r;	
		this.interest=interest;	
		this.time=time;
	}
	public void rate()
	{
		System.out.println("The rate of interest is = "+r);
	}
	public void calculate() {
		double sum=(interest*r*time)/100;
		System.out.println("The Total interest received is = "+sum);
	}
}
class Bank2 implements Bank
{
	private int r,time;
	private double principle;
	Bank2(double principle,int r,int time)
	{
		super();
		this.r=r;	
		this.principle=principle;	
		this.time=time;
	}
	public void rate()
	{
		System.out.println("The rate of interest is = "+r);
	}
	public void calculate() {
		double sum=(principle*r*time)/100;
		System.out.println("The Total interest received is = "+sum);
	}
}

public class BankByInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank1 s1 =new Bank1(10000,5,2);
		s1.name("Bank of Baorda");
		s1.rate();
		s1.calculate();
		Bank2 s2=new Bank2(20000,6,5);
		s2.name("Hdfc Bank");
		s2.rate();
		s2.calculate();
	}

}
