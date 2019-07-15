//****************************************************************
//PitchCount.java                                          Lab PitchCount
//
// Preetham Thelluri                                            1-31-19
//
//Using 2d arrays and manipulating them to look like stairs 
//****************************************************************
import java.util.Scanner;
public class PitchCount
{
public static void main(String[] args)
   {
  int max;
  int min;
  int total;
  int pitcher;
  String again = "y";
  Scanner scan = new Scanner(System.in);
  int[] []  pitchArray = {
    {45, 105, 67},
    {81, 100, 93, 25, 128, 88}, 
    {45, 53}, 
    {79, 107, 53, 79}, 
    {11, 9, 3, 63, 20, 18, 3} };
  //DecimalFormat dec = new DecimalFormat(");
  for (int row = 0; row < pitchArray.length; row++)
  {
    total = 0;
    max = pitchArray[row][0];
    min = pitchArray[row][0];
    for (int col = 0; col < pitchArray[row].length; col++)
    {
      if (pitchArray[row][col] > max)
       max = pitchArray[row][col];
      else if (pitchArray[row][col] < min)
        min = pitchArray[row][col];
      total+= pitchArray[row][col];
    }
    System.out.println (" Pitcher #" + (row+1) + " pitched " + pitchArray[row].length+ " games. His largest pitch count was: " 
                          +max+", smallest was:"+min+", total pitches were:"+total+", and the average num,ber of pitches per game is: "+((double)total/pitchArray[row].length)+"\n");
  }
 while (again.equalsIgnoreCase("y"))
 {
   System.out.println ("Enter the number for the Pitcher whose stats you want to see");
   pitcher = scan.nextInt();
   total = 0;
   max = pitchArray[pitcher - 1][0];
   min = pitchArray[pitcher - 1][0];
  for (int col = 0; col < pitchArray[pitcher -1].length; col++)
    {
      if (pitchArray[pitcher - 1][col] > max)
         max = pitchArray[pitcher -1 ][col];
      else if (pitchArray[pitcher - 1][col] < min)
        min = pitchArray[pitcher - 1][col];
      total+= pitchArray[pitcher - 1][col];  
    }
  System.out.println (" Pitcher # " + (pitcher -1 +1) + " pitched " +pitchArray[pitcher -1].length+" games. His largest pitch count was: " 
                          +max+", smallest was:"+min+", total was: "+total+", and the average pitch count was: "+((double)total/pitchArray[pitcher-1].length)+"\n");
  System.out.println("Would you like to check the stats of another pitcher? (y/n)");
  again = scan.next();
}
}
}