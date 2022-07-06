package executor;
import entity.Studenttest;
import entity.Teachertest;
import service.Testrelation;

public class Testmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studenttest s = new Studenttest();
		s.setRollno(21);
		s.setSname("Dharshan");
		Teachertest t =new Teachertest();
		t.setTname("Amin");
		t.setCname("Oxford");
		Testrelation.giveClass(s);
		Testrelation.takeClass(t);
	}

}
