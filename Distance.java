//*****************************************************************************************************************************
// Distance.java                                      Lab2_8
// Preetham                                           9/11/18
// This program helps me learn the usage of the math package and later combine it to compute the distance between two points.
//*****************************************************************************************************************************
import java.util.Scanner;
import java.lang.Math;

public class Distance{
  public static void main(String[]args){
    //-----------------------------------------------------------------
    // Prints the distance between two points on a coordinate plane
    //-----------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    double x1, y1, x2, y2;
    System.out.println("Enter the 1st x coordinate");
    x1 = sc.nextDouble();
    System.out.println("Enter the 1st y coordinate");
    y1 = sc.nextDouble();
    System.out.println("Enter the 2nd x coordinate");
    x2 = sc.nextDouble();
    System.out.println("Enter the 2nd y coordinate");
    y2 = sc.nextDouble();
    
    double distancePart1 = Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2);
    double distanceComplete = Math.pow(distancePart1, 0.5);
    
    System.out.println("The distance between ("+x1+", "+y1+") "+"and ("+x2+" ,"+y2+") is about "+distanceComplete+" units.");
    sc.close();
  }
}

    