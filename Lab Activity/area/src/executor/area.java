package executor;

public class area {
	int length;
	int width;
	int tarea;
	
	void input(int l,int w) 
	{
		length=l;
		width=w;
		tarea=l*w;
		
	}
	
	void display()
	{
		System.out.println("Area of rectangle is = "+tarea);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		area s= new area();
		s.input(15,35);
		s.display();
	}

}
