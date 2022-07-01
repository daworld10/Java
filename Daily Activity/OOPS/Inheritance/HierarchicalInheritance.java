package executor;

//Write a program to test Hierarchical Inheritance

class Parent {
 public Parent(){ System.out.println("\nParent class executed..."); }
}

class Child1 extends Parent {
 // show()
 public Child1(){ System.out.println("Child1 class executed..."); }
}

class Child2 extends Parent {
 // show()
 public Child2(){ System.out.println("Child2 class executed..."); }
}

public class HierarchicalInheritance {
 
 public static void main(String[] args){

     Child1 c1 = new Child1();
     Child2 c2 = new Child2();
 }
}