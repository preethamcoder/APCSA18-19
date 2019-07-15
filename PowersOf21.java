// ****************************************************************
//   PowersOf2.java
//   Print out as many powers of 2 as the user requests
// ****************************************************************
import java.util.Scanner;
import java.lang.Math;
public class PowersOf21
{
    public static void main(String[] args)
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("How many powers of 2 do you wish to print out? ");
        int input = sc.nextInt();
        int exponent = 1;
        int powerNext = 1;
        int nextPower = 0;
        
        while(exponent<=input){
          System.out.println("");
          powerNext *= 2;
          exponent +=1;
          System.out.println(powerNext);
        }
    
    }*/
      for(int k = 1; k <= 6; k += 1)
      {
        for(int i = 1; ((i <= 6)&&(k % 2== 0)); i += 1)
          System.out.print("*");
        for(int i = 1; ((i<=6)&&(k % 2 != 0)); i += 1)
          System.out.print("+");
        System.out.println();
        }
      
      }
    /*
     * if(k%2==0)
     * for()
     * print
     * 
      
    }

    
    
