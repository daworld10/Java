//WAP to perform Abstraction using abstract method
package executor;

abstract class Shape
{
	abstract void area();	
}
class Circle extends Shape
{
	int radius;

	public Circle(int radius)
	{
		super();
		this.radius=radius;
	}
	
	void area()
	{
		System.out.println("The area of Circle is = "+(3.14*radius*radius));
	}
}
class Rectangle extends Shape{
	int l,w;
	
	public Rectangle(int l, int w) {
		super();
		this.l = l;
		this.w = w;
	}

	void area()
	{
		System.out.println("The area of rectangle is = "+(l*w));
	}
}
class Square extends Shape
{
	int a;
	public Square(int a) 
	{
			super();
			this.a = a;
		}
	void area(){
			System.out.println("The area of Square is = "+(a*a));
		}
	}
	

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle s1=new Circle(5);
		Rectangle s2=new Rectangle(7,9);
		Square s3=new Square(11);
		s1.area();
		s2.area();
		s3.area();
	}

}
//We cannot implement abstraction in this method 100 percent
// We cannot create object for abstract class
// Each abstract class must contain a abstract method