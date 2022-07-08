//Write a program to handle NumberFormatException
package executor;

public class NumberFormatException1 {
 public static void main(String args[]){

     try {
         int num = Integer.parseInt ("akki") ;    // "akki" is not a number
         System.out.println(num);
     } 
     catch(NumberFormatException e) {
         System.out.println("\nNumber format exception");
     }
 }
}
