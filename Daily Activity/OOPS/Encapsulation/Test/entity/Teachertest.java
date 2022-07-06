package entity;

public class Teachertest {
	private String tname;
	private String cname;
	
	public Teachertest() 
	{
		super();
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Teachertest [tname=" + tname + ", cname=" + cname + "]";
	}

}
