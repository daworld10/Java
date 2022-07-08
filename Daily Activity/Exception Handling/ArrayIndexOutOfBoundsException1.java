//Write a program to handle ArrayIndexOutOfBoundsException
package executor;

public class ArrayIndexOutOfBoundsException1 {
 public static void main(String args[]){

     try{
         int a[] = new int[5];
         a[6] = 9;                // array size is 5 and trying to change 6th element value
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("\nArray Index is Out Of Bounds");
     }
 }
}
