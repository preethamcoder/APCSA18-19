//*****************************************************************************************************
// FloatNums.java                                       Lab2_3
// Preetham                                           9/10/18
// This program helps me laern how to make the computer do logical operations with float numbers
//*****************************************************************************************************
import java.util.Scanner;
import java.lang.Math;
public class FloatNums{
  //--------------------------------------------------
  // Sum, difference, and product of two float numbers
  //--------------------------------------------------
  public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number: ");
    float num1 = sc.nextFloat();
    System.out.println("Enter your second number: ");
    float num2 = sc.nextFloat();
    float sum = num1 + num2;
    float difference = Math.abs(num2 - num1);
    float product = num1*num2;
    System.out.println("The sum of your numbers is: " +sum);
    System.out.println("The difference of your numbers is: " +difference);
    System.out.println("The product of your numbers is: " +product);
    sc.close();
  }
}
