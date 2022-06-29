public class DefaultTest {
    
    // Default Constructor
    // DefaultTest() will set rollno=0
    int rollno;
    void disp(){
        System.out.println("The roll no. is: " + rollno);
    }

    public static void main(String[] args){

        DefaultTest d = new DefaultTest();
        d.disp();
    }
}
