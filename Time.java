//***************************************************************************************************************
// Time.java                                          Lab2_6
// Preetham                                           9/11/18
// This program prints a certain time in seconds and tecahes me how to add three distinct expressions together.
//***************************************************************************************************************
import java.util.Scanner;

public class Time{
  public static void main(String[]args){
    //----------------------------------------------------------------------------
    // This program prints the time in seconds given minutes, hours, and seconds.
    //----------------------------------------------------------------------------
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of hours.");
    int hours = sc.nextInt();
    System.out.println("Enter the number of minutes.");
    int minutes = sc.nextInt();
    System.out.println("Enter the number of seconds.");
    int seconds = sc.nextInt();
    int timeInSeconds = ((3600*hours) + (60*minutes) + (seconds));
    System.out.println(hours + " hour(s) "+minutes+" minute(s) and "+seconds+" second(s) is " +timeInSeconds+" seconds.");
    sc.close();
  }
}

    