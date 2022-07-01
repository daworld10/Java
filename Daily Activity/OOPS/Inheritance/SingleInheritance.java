//Write a program to test Single Inheritance
package executor;

class Parent4 
{
 void show()
 {
     System.out.println("Parent class executed...");
 }
}

class Child4 extends Parent4 {
 // show()
 void disp()
 {
     System.out.println("Child class executed...");   
 }
}

public class SingleInheritance {
 public static void main(String[] args){
     Child4 c = new Child4();
     c.show();
     c.disp();
 }
}
