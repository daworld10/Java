//Write a program to handle ArithmeticException

package executor;

public class ArithmeticException1 {
 public static void main(String[] args){

     try {
         int number1 = 10;
         int number2 = 0;
         int result = number1/number2;                     // dividing by zero
         System.out.println("The result is " + result);
     }
     catch(ArithmeticException e) {
         System.out.println("\nCannot divide any number by zero");
     }
     finally {
         System.out.println("Application in normal way...");
     }
 }
}