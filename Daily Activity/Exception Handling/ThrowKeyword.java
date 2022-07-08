//Write a program to test Throw keyword
package executor;

public class ThrowKeyword {
 
 // void eligible(int age){
 static void eligible(int age, int weight){
     
     if(age<18 && weight<40)
         throw new ArithmeticException("Not eligible for voting...");
     else 
         System.out.println("You are eligible for voting...");
 }

 public static void main(String[] args){
     
     // ThrowKeyword t = new ThrowKeyword();
     // t.eligible(17);

     eligible(20, 38);
 }
}