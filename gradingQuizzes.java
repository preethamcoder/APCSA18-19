// **********************************************************************************************
// gradingQuizzes.java
//
// This program asks for a teacher to enter grades and checks the answer to return the grades.
// **********************************************************************************************
import java.util.Scanner;

public class gradingQuizzes
{
    public static void main(String[] args)
    {
 final int SALESPEOPLE = 5;
 int[] sales = new int[SALESPEOPLE];
 int sum;

 Scanner scan = new Scanner(System.in);
 for (int i=0; i<sales.length; i++)
     {
  System.out.print("Enter sales for salesperson " + (i+1) + ": ");
  sales[i] = scan.nextInt();
     }
int temp = sales[((sales.length/2)+1)];

 System.out.println("\nSalesperson   Sales");
 System.out.println("--------------------");
 sum = 0;
 for (int i=0; i<sales.length; i++)
     {
  System.out.println("     " + (i+1) + "         " + sales[i]);
  sum += sales[i];
     }
 System.out.println("\nTotal sales: " + sum);
 System.out.println("Average sales: " +(sum/5));
 
 for (int i=0; i<sales.length; i++)
     {
   if(sales[i]>temp){
     temp = sales[i];
     System.out.println("Salesperson "+(i+1)+" has the most sales reading "+temp);
   }else{
     System.out.println("Salesperson "+((sales.length/2)+1)+" has the most sales "+temp);
   }
 }
 scan.close();
     }
 
}

