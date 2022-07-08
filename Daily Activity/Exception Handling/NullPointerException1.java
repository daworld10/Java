//Write a program to handle NullPointerException
package executor;


class NullPointerException1 {
public static void main(String args[]){

 try {
   String a = null; 
   System.out.println(a.charAt(0));   // trying to access 0th element of the null string
 } 
 catch(NullPointerException e) {
   System.out.println("\nNullPointerException..");
 }
}
}