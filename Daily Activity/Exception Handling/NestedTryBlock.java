//Write a program to implement nested try block
package executor;

public class NestedTryBlock {
 public static void main(String[] args){
     
     // outer block
     try {
         // inner block
         try {
             int a = 5/0;
         }
         catch(ArithmeticException e){
             System.out.println("Exception handle: " + e);
         }
     }
     catch(Exception e1){
         System.out.println("Exception2 handle: " + e1);
     }
     finally {
         System.out.println("Hello");
     }
 }
}
