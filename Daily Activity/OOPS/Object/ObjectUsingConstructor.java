// WAP to initialise the object using constructor

class TestReference {

    int rollno;
    String name;
    
    TestReference(int r, String n){
        rollno = r;
        name = n;
        System.out.println("Name = " + name);
        System.out.println("Roll no. = " + rollno);   
    }
}

public class ObjectUsingConstructor {
    public static void main(String[] args){

        TestReference t = new TestReference(39, "Aditya");
    }
}
