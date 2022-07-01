package executor;

//Write a program to test Multi-level Inheritance

class Parent3 {
 void show(){ System.out.println("\nParent class executed..."); }
}

class Child3 extends Parent3 {
 // show()
 void disp(){ System.out.println("Child class executed..."); }
}

class GrandChild3 extends Child3 {
 // show()
 // disp()
 void out(){ System.out.println("GrandChild class executed..."); }
}

public class MultilevelInheritance {
 
 public static void main(String[] args){

     GrandChild3 g = new GrandChild3();
     g.show();
     g.disp();
     g.out();
 }
}