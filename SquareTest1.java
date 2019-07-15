// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if 
// each square is magic.
//          
// ****************************************************************

import java.util.Scanner;
import java.io.*;

public class SquareTest1
{
    public static void main(String[] args) throws IOException
    {
      Scanner scan = new Scanner(new File("magicData.txt"));

      int count = 1;                 //count which square we're on
      int size = scan.nextInt();     //size of next square

      //Expecting -1 at bottom of input file
      while (size != -1)
      {

        //create a new Square of the given size
        magicSquare square = new magicSquare(size);

        //call its read method to read the values of the square
        square.readSquare(scan);

        System.out.println("\n******** Square " + count + " ********");
        //print the square
        square.printSquare();

        //print the sums of its rows
       
          System.out.println("The sum of rows is " + square.sumRow(0));
        
        

        //print the sums of its columns
      
                System.out.println("The sum of coloumn is " + square.sumCol(0));
       
        

        //print the sum of the main diagonal
         System.out.println("The sum of the main diagonal is " + square.sumMainDiag());

        //print the sum of the other diagonal
         System.out.println("The sum of the other diagonal is " + square.sumOtherDiag());

        //determine and print whether it is a magic square
        if(square.magic())
          System.out.println("The square is a magic square");
        else
          System.out.println("The square is not a magic square");

        //get size of next square
        size = scan.nextInt();
        count++;
     }

   }
}
 
