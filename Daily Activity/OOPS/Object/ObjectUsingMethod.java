// WAP to initialise the object using method

class TestReference {
    int rollno;
    String name;
    void setData(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    void dispData(){
        System.out.println("Name = " + name);
        System.out.println("Roll no. = " + rollno);
    }
}

public class ObjectUsingMethod {
    public static void main(String[] args){

        TestReference t = new TestReference();
        t.setData(39, "Aditya");
        t.dispData();
    }
}
