//*****************************************************************************************************
// Average.java                                       Lab2_2
// Preetham                                           9/10/18
// This program prints the average of 3 numbers input by the user and teaches me the usage of scanners
//*****************************************************************************************************

import java.util.Scanner;

public class Average{
  //---------------------------------------------------------------------------------------
  // This program prints the average of three numbers and teaches me how to use the scanner
  //---------------------------------------------------------------------------------------
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    int num1 = sc.nextInt();
    System.out.println("Enter your second number: ");
    int num2 = sc.nextInt();
    System.out.println("Enter your third number: ");
    int num3 = sc.nextInt();
    float sum = num1 + num2 + num3;
    //System.out.println(sum);
    float average = sum/3;
    System.out.println("The average of "+num1+", "+num2+", and "+num3+" is "+average);
    sc.close();
  }
}
