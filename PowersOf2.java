// ****************************************************************
//   PowersOf2.java
//   Print out as many powers of 2 as the user requests
// ****************************************************************
import java.util.Scanner;
//import java.lang.Math;
public class PowersOf2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many powers of 2 do you wish to print out? ");
        int input = sc.nextInt();
        int exponent = 0;
        int powerNext = 1;
        //int nextPower = 0;
        System.out.println("Here are the first "+input+" powers of 2:");
        while(exponent<input){
          /*if(exponent<1){
            powerNext *= 2;
            System.out.println("2^"+(exponent)+"="+powerNext);
          }*/
          powerNext *= 2;
          System.out.println("2^"+(exponent)+" = "+(powerNext/2));
          exponent +=1;
        }
        sc.close();
    }
}
