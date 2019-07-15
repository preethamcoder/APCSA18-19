//*****************************************************************************************************************************
// timeInHours.java                                   Lab2_7
// Preetham                                           9/11/18
// This program helps me learn the usage of the % operator and later combine it to display time in hours, minutes, and seconds.
//*****************************************************************************************************************************
import java.util.Scanner;

public class timeInHours {
  public static void main(String[]args){
    //-------------------------------------------------------
    // This converts seconds to hours, minutes, and seconds.
    //-------------------------------------------------------
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter your seconds. ");
    int seconds = sc.nextInt();
    int hour = seconds/3600;
    int remSecs = (seconds % 3600);
    int minutes = remSecs/60;
    int remSecs2 = (remSecs%60);
    System.out.println(seconds+" seconds is "+hour+" hour(s), "+minutes+" minute(s), and "+remSecs2+" second(s).");
  }
}
