
package executor;

public class Null {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[15];
			a[16]=10;
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception");
		}
	}

}
