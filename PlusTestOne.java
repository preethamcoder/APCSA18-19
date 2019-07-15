// *******************************************************************
//   PlusTestOne.java
// 
//   Demonstrate the different behaviors of the + operator
// *******************************************************************

public class PlusTestOne
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
  String str;

  str = "Alpharetta " + "Rocks!";  // IN this case, the strings are put together to print "Alpharetta Rocks!
            System.out.println(str);

  str = ("Countdown: " + 5 + 4 + 3 + 2 + 1 + 0 );// Because there is a string first, the numbers are just considered strigs and are merged together
            System.out.println(str);
            
  str = 1 + 2 + 3 + " Go!\n";// Because the numbers are first, they are considered integers and are added togther before "Go!" is printed
            System.out.println(str);

    }
}
