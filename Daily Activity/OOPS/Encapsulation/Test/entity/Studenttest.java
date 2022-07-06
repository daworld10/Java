package entity;

public class Studenttest 
{
	private int rollno;
	private String sname;
public Studenttest()
{
	super();
}
public Studenttest(int rollno, String sname) {
	super();
	this.rollno = rollno;
	this.sname = sname;
	}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override                         
public String toString() {
	return "Studenttest [rollno=" + rollno + ", sname=" + sname + "]";
}

}
