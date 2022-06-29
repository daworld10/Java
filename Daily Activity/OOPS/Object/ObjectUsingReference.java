// WAP to initialise the object using reference variable

class Student {
    int rollno;
    String name;
}

public class ObjectUsingReference {
    public static void main(String[] args){

        Student s = new Student();
        s.rollno = 39;
        s.name = "Aditya";
        System.out.println("Name = " + s.name);
        System.out.println("Roll no. = " + s.rollno);
    }
}

