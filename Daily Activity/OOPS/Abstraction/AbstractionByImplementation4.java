package executor;

interface Area
{
	void para(int a,int b);  //parameters passed to methods
	void para1(int r);
}
class Rect implements Area
{
	public void para(int a,int b)
	{
		System.out.println("The area of Rectangle is = "+(a*b));
	}
	@Override
	public void para1(int r) {           //this is override method but we can still call it using object
		// TODO Auto-generated method stub
		System.out.println("The area of Circle is = "+(3.14*r*r));
	}
}
class Circ implements Area
{
	public void para1(int r)
	{
		System.out.println("The area of Circle is = "+(3.14*r*r));
	}

	@Override
	public void para(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
public class AbstractionByImplementation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect s=new Rect();
		s.para(7,9);
		s.para1(15);          //by using object we can call the override unimplemented method
		Circ c=new Circ();
		c.para1(11);

	}

}

