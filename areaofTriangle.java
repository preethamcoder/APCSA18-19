//*************************************************************************************************
// areaOfTriangle.java                                                 Lab2_10
// Preetham                                                            9/11/18
// This program helps me learn the usage of the math package and prints area of a triangle.
//*************************************************************************************************

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Lab2_10{
  public static void main(String[]args){
    //----------------------------------------------------
    // prints the area of a triangle with Heron's formula
    //----------------------------------------------------
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first side. ");
    double sideA, sideB, sideC;
    sideA = sc.nextDouble();
    System.out.println("Enter the second side.");
    sideB = sc.nextDouble();
    System.out.println("Enter the third side.");
    sideC = sc.nextDouble();
    //System.out.println("Enter the third side.");
    double semiPeri = (sideA+sideB+sideC)/2;
    double areaReal = Math.pow((semiPeri*(semiPeri-sideA)*(semiPeri-sideB)*(semiPeri-sideC)), 0.5);
    DecimalFormat fmt = new DecimalFormat ("0.###");
    System.out.println("The area of the triangle with sides: "+sideA+", "+sideB+", "+sideC+" is: "+fmt.format(areaReal)+" units squared.");
    sc.close();
  }
}
