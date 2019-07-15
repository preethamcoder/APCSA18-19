//**********************************************************************************************
//Lab2_13                                                                      PhoneNumber
//Preetham                                                                     9/18/18
//This program helps me learn the usage of the random numebr function and string concatenation. 
//**********************************************************************************************

//import java.util.Random;
import java.lang.Math;
import java.text.DecimalFormat;
public class Lab2_13{
  public static void main(String[]args){
    //-------------------------------------------------------------------------
    // The numbers are generated randomly with some restrictions on parameters
    //-------------------------------------------------------------------------
    //Random generator = new Random();
    DecimalFormat onef = new DecimalFormat("000");
    DecimalFormat twof = new DecimalFormat("0000");
    int digitOne, digitTwo, digitThree, secondSet, lastSet;
    digitOne = (int) (Math.random()*8);
    System.out.print("The random phone number is "+digitOne);
    digitTwo = (int) (Math.random()*8);
    System.out.print(digitTwo);
    digitThree = (int) (Math.random()*8);
    System.out.print(digitThree+"-");
    secondSet = (int) (Math.random()*743);
    System.out.print(onef.format(secondSet)+"-");
    lastSet = (int) (Math.random()*10000);
    System.out.println(twof.format(lastSet));
    
  }
}
