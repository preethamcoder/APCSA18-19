// ****************************************************************
//   LoveCS.java
//   Use a while loop to print many messages declaring your 
//   passion for computer science
// ****************************************************************
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
  //final int LIMIT = 10;
  System.out.println("Enter the number of times you want to print the message. ");
  int times = sc.nextInt();
  int count = 1;
  int sum=0;
  while (count <= times)
{
       System.out.println(count+" I love Computer Science!!");
       sum = sum+count;
       count++;
       
  }System.out.println("Printed the message "+(count-1)+" times."+" The sum of numbers from 1 to "+(count-1)+" is "+sum);
  //System.out.println();
    sc.close();
    
    
}
}