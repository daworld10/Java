/*Write a program to do the following process 
-Number of Duplicate Words in String
-Number of Words in Given String
-Occurrences of Each Character in String
-Remove Duplicate Words from String 
-Count of Vowels*/

package executor;

import java.util.Scanner;

public class S_qCountWords 
{
	public static void input()
	{
		System.out.println("Please Enter your Name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		duplicate(name);
		cal(name);
		occurence(name);
		vowels(name);
	}
	public static void duplicate(String name)
	{
		String[] words=name.split(" ");  //Split the word from String
	      int wrc=1;    //Variable for getting Repeated word count
	      
	      for(int i=0;i<words.length;i++) //Outer loop for Comparison       
	      {
	         for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
	         {
	            
	         if(words[i].equals(words[j]))  //Checking for both strings are equal
	            {
	               wrc=wrc+1;    //if equal increment the count
	               words[j]="0"; //Replace repeated words by zero
	            }
	         }
	         if(words[i]!="0")
	         System.out.println(words[i]+"--"+wrc); //Printing the word along with count
	         wrc=1;
	         
	        }  
	         
	   }
	public static void cal(String name)
	{	
		int count = 1;
		 
        for (int i = 0; i < name.length() - 1; i++)
        {
            if ((name.charAt(i) == ' ') && (name.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("\nNumber of words in string are : "+count);
	}
	
	public static void occurence(String name)
	{
 
		int count[] = new int[256];   
		for (int i = 0; i <name.length(); i++)  //initialize count array index 
		count[name.charAt(i)]++;  
		char ch[] = new char[name.length()];  //create an array of given String size 
		for (int i = 0; i <name.length(); i++)   
		{  
		ch[i] = name.charAt(i);  
		int find = 0;  
		for (int j = 0; j <= i; j++)   
		{  
			
		//if any matches found  
		if (name.charAt(i) == ch[j])  
		find++;
		}             
		if (find == 1)  
		//prints occurrence of the character   
		System.out.println("The occurrence of "+ name.charAt(i)+ " is: " + count[name.charAt(i)]);  
		
		}  
		
	}
	public static void vowels(String name)
	{	char[] vowels = {'a','e','i','o','u'};
	     int vowelcount = 0;
	     char[] tempchars = name.toCharArray();
	     for(int i =0;i< tempchars.length;i++)
	     {
	         for(int j = 0;j< vowels.length;j++)
	         {
	                if(tempchars[i] == vowels[j])
	                {
	                    vowelcount++;
	                }
	            }
	}
	     System.out.println("Number of vowles = "+vowelcount);
	}
	
   public static void main(String[] args)
   {	
      input();
     
   }
}