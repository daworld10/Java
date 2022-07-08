//Define class Employee with instance variable empname, salary and 
//inherit two child classes for the parent class Employee 
//where hike as data member of child class, implement Hierarchical inheritnace and 
//calculate the hike of employee where the percentage for permanant employee is 0.5 and for tempoary employee is 0.3
package executor;

import java.util.Scanner;

class Employee {
 String empname;
 double salary;
 double hike;
}

class Permanent extends Employee {

 void setData(String e, double s){
     empname = e;
     salary = s;
     hike = salary + (0.5*salary);
 }
 double getHike(){
     return hike;
 }
}

class Temporary extends Employee {

 void setData(String e, double s){
     empname = e;
     salary = s;
     hike = salary + (0.3*salary);
 }
 double getHike(){
     return hike;
 }
}

public class Employee1 {
 public static void main(String[] args){
 
     Scanner s = new Scanner(System.in);
     System.out.println("\nEnter your name : ");
     String name = s.nextLine();
     System.out.println("Enter your salary : ");
     double salary = s.nextInt();
     System.out.println("Are you Permanent or Temporary employee? : ");
     String pos = s.next();
     pos = pos.toUpperCase();
     
     if(pos.equals("PERMANENT")){
         Permanent p = new Permanent();
         p.setData(name, salary);
         double hike = p.getHike();
         System.out.println("Your salary hike --> " + hike);
     }
     else if(pos.equals("TEMPORARY")){
         Temporary t = new Temporary();
         t.setData(name, salary);
         double hike = t.getHike();
         System.out.println("Your salary hike --> " + hike);
     }
     else {
         System.out.println("Please enter valid inputs..!");
     }
 }
}