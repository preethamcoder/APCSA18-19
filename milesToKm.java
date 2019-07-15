//****************************************************************************************
// milesToKm.java                                     Lab2_5
// Preetham                                           9/10/18
// This program converts miles to kilometers with the help of scanners taking user inputs
//****************************************************************************************
import java.util.Scanner;
public class milesToKm{
  //----------------------------------------
  // this convers miles to kilometers
  //----------------------------------------
  
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    float converFact = 1.60935f;
    System.out.println("Enter the distance in miles: ");
    float distMiles = sc.nextFloat();
    float kms = converFact*distMiles;
    System.out.println(distMiles + " mile(s) is " + kms + " kilometers.");
    sc.close();
  }
}
