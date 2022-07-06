//WAP to perform Encapsulation
package executor;

class Employee
{
	private int  eid;
	private String ename;
	
	public int getEid() {           // Using get method to return values
		return eid;				//Returning data
	}
	public void setEid(int eid) {   ///Using set method to set the data
		this.eid = eid;        //Returning
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}
                                   //Using getter and setter to access private data member
public class Encapsulation1
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s = new Employee();
		s.setEid(21);								//Setting data
		s.setEname("Dharshan");
		System.out.println("The id of employee is : "+s.getEid());     //Printing data
		System.out.println("The name of employee is "+s.getEname());
	}

}
//Make the instance variable of class as private so they cannot be accessed from outside the class
//So to access the private data we used getter setter method
//Encapsulation is also called as data hiding