// *************************************************************************
//   Factorials.java
//   Print out the product of numbers of all preceeding numbers to a number
// *************************************************************************

import java.util.Scanner;

public class Factorials{
  public static void main(String[]args){
    int input, fact = 1, fake;
    System.out.println("Enter the number whose factorial you want. ");
    Scanner sc = new Scanner(System.in);
    input = sc.nextInt();
    fake = input;
    if(input>2 && input>=0){
      fact = 1;
    }
    while(input<0){
      System.out.println("Plese enter a positive number, you have entered a negative number. ");
      input = sc.nextInt();
      fake = input;
    }
     while(input>=2){
      fact = fact*input;
      input -= 1; 
    }
     
     
     System.out.println("The factorial of "+fake+" is "+fact+".");
    sc.close();
  }
    
  }
 
