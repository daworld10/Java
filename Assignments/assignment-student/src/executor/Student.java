//Write a program to Get and Print Student's Details in Java like rollno, name, five subjects marks
//accepts from user and find out the average
package executor;

import java.util.Scanner;

class DisplayInfo {

 DisplayInfo(String name, int roll, int physics, int chemistry, int maths, int cs, int evs){
     System.out.println("\n---------------- Student Information ----------------");
     System.out.println("\nName: " + name);
     System.out.println("Roll no.: " + roll);
     System.out.println("\nMarks --------->" + "\nPhysics: " + physics + "\nChemistry: " + chemistry + "\nMaths: " + maths + "\nCS: " + cs + "\nEVS: " + evs);
     System.out.println("\nAverage = " + (physics + chemistry + maths + cs + evs)/5);
     System.out.println("\n-----------------------------------------------------\n");
 }    
}

public class Student {
 public static void main(String[] args){
     
     Scanner s = new Scanner(System.in);
     System.out.println("\nEnter your name: ");
     String name = s.nextLine();
     System.out.println("Enter roll number: ");
     int roll = s.nextInt();
     System.out.println("Enter subject marks as per sequence [Physics Chemistry Maths CS EVS]: ");
     int physics = s.nextInt();
     int chemistry = s.nextInt();
     int maths = s.nextInt();
     int cs = s.nextInt();
     int evs = s.nextInt();

     DisplayInfo d = new DisplayInfo(name, roll, physics, chemistry, maths, cs, evs);
 }    
}