// *******************************************************************
//   PlusTestTwo.java
// 
//   Demonstrate the different behaviors of the + operator
// *******************************************************************

public class PlusTestTwo
{
    // -------------------------------------------------
    // main prints some more expressions using the + operator
    // -------------------------------------------------
    public static void main (String[] args)
    {
    System.out.println ("This is a long string that is the " +
           "concatenation of two shorter strings.");

    System.out.println ("The first computer was invented about " + 55 +
           " years ago.");// Spaces were added to prevent the statement from being too scrunched up

    System.out.println ("8 plus 5 is " + 8 + 5);// Output is "8 plus 5 is 85". This was printed because there was a string up front and these numbers were treated as string and were simply put together. If an expression contains more than one operation expressions inside parentheses are evaluated first. If there are no parentheses the expression is evaluated left to right. 

    System.out.println ("8 plus 5 is " + (8 + 5));// Output is "8 plus 5 is 13". This was printed becasue there were parenthesis around 8 and 5 and they were considered integers and added together to print 13. There was string up front but the parenthesis helped in distinguishing between strings and integers. If both operands are numbers + is treated as ordinary addition.

    System.out.println (8 + 5 + " equals 8 plus 5.");// Output is "13 equals 8 plus 5." This was printed because there were integers upfront which were simply put together and then concatenated with the string. 
    }                                                // If an expression contains more than one operation expressions inside parentheses are evaluated first.  If there are no parentheses the expression is evaluated left to right. 
}
