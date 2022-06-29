pacakage executor;
public class TestConstructor {
    
    // Default Constructor
    // TestConstructor(){
    //     System.out.println("Constructor called...");
    // }

    // Parameterized Constructor
    TestConstructor(int r){
        System.out.println("Constructor called..." + r);
    }

    void display(){
        System.out.println("Method called...");
    }
    
    public static void main(String[] args){

        TestConstructor t = new TestConstructor(7);
        // class ka object t banaya toh constructor by default call hoga

        System.out.println("************************");

        t.display();
    }
}
