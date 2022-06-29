package executor;
public class ParameterizedTest {
    
    int rollno;

    // Parameterized Constructor
    ParameterizedTest(int r){
        rollno = r;
    }

    void disp(){
        System.out.println("The roll no. is: " + rollno);
    }

    public static void main(String[] args){

        ParameterizedTest p = new ParameterizedTest(39);
        p.disp();
    }

}
