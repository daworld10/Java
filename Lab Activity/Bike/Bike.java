// Define a class called Bike with the following description:
// Instance variables/data members:
//   String bno – to store the bike’s number(MH65AB1234)
//   String name – to store the name of the customer
//   int days – to store the number of days the bike is taken on rent
//   int charge – to calculate and store the rental charge
// Member methods:
//   void input( ) – to input and store the detail of the customer.
//   void compute( ) – to compute the rental charge The rent for a bike is charged on the following basis.
//                     First five days Rs 500 per day;
//                     Next five days Rs 400 per day
//                     Rest of the days Rs 200 per day
//   void display ( ) – to display the details in the following format:
//                      BikeNo, PhoneNo, No. of days charge

package executor;
import java.util.Scanner;

public class Bike 
{
    String bno;
    String name;
    int days;
    int charge;

    void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = s.nextLine();
        System.out.println("Enter bike number: ");
        bno = s.nextLine();
        System.out.println("Enter number of days for rent: ");
        days = s.nextInt();
    }
    void compute()
    {
        if(days <= 5)
            charge = days*500;
        else if(days <= 10)
            charge = 5*500 + (days-5)*400;
        else 
            charge = 5*500 + 5*400 + (days-10)*200;
    }
    void display(){
        System.out.println("\nName: " + name + "\nBike number: " + bno + "\nNumber of days rent: " + days + "\nCharge: " + charge);
    }

    public static void main(String[] args){

        Bike b = new Bike();
        b.input();
        b.compute();
        b.display();
    }
}