//Write a program for Airline company, you are in the luggage check departmnet and 
//as per the rules you can allow only 20kg per customer, if more than 20kg of weight is not accepted

package executor;
import java.util.Scanner;

interface luggage {
 void weight(int w);
}

class TotalWeight implements luggage {

 @Override
 public void weight(int w){
     if(w <= 20)
         System.out.println("Accepted");
     else 
         System.out.println("Not Accepted");
 }
}

public class Airline {
 public static void main(String[] args){
     
     Scanner s = new Scanner(System.in);
     System.out.println("\nEnter weight of the luggage: ");
     int w = s.nextInt();
     
     TotalWeight t = new TotalWeight();
     t.weight(w);
 }    
}