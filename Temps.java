// **********************************************************
//   Temps.java
//   This program reads in a sequence of hourly temperature 
//   readings (beginning with midnight) and prints the maximum
//   temperature (along with the hour, on a 24-hour clock, it 
//   occurred) and the minimum temperature (along with the hour
//   it occurred).
// **********************************************************

import java.util.Scanner;

public class Temps
{
//----------------------------------------------------
//  Reads in a sequence of temperatures and finds the
//  maximum and minimum read in.
//----------------------------------------------------
public static void main (String[] args)
     {
  final int HOURS_PER_DAY = 4;

  int temp;   // a temperature reading
  int maxTemp = -1000;
  int hourMax = 0;
  int hourMin = 0;
  int minTemp = 1000;
  Scanner sc = new Scanner(System.in);
  //int minTemp;
  // print program heading
  System.out.println ();
System.out.println ("Temperature Readings for 24 Hour"     + " Period");
  System.out.println ();

  for (int hour = 0; hour < HOURS_PER_DAY; hour++)
  {
    System.out.print ("Enter the temperature reading at " + hour + " hours: ");
       temp = sc.nextInt();
       if(temp>maxTemp){
         maxTemp = temp;
         hourMax = hour;
       }
       if(temp<minTemp){
         minTemp = temp;
         hourMin = hour;
       }
  }
  
  
   System.out.println("Hour "+hourMax+" has the maximum temperature of "+maxTemp+" degrees.");
   System.out.println("Hour "+hourMin+" has the minimum temperature of "+minTemp+" degrees.");
  
  sc.close();
  // Print the results
     }

}