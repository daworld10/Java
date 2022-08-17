package executor;

public class use_of_enum 
{
	public static void display()
	{
		my m1=my.Dharshan;
		System.out.println(m1);
		my m2[]=my.values();
		System.out.println(m2[3]);
		for (my n1:m2)
		{
			System.out.println(n1+"="+n1.ordinal());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();
		
	}

}
