//*****************************************************************************************************
// 3_14 lab exercise                                                       rockpapaerscissor
// Preetham                                                                11/7/18
// This lab helps me learn the use of while and if statements embedded together.
//*****************************************************************************************************
import java.util.Scanner;
public class rockPap{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Type either rock, paper or scissors. Type Stop to quit");
    String input = scan.nextLine();
    
    int rand = (int)(Math.random() * 3);
    
    String comp = "";
    
    int playCount = 0;
    
    int winCount = 0;
    int tieCount = 0;
    int loseCount = 0;
    
    
    //Main Game  
    while(input != "stop" || input != "Stop")
    {
      rand = (int)(Math.random() * 3);

      if(rand == 0){
        comp = "Rock";
      }
      if(rand == 1){
        comp = "Paper";
      }
      if(rand == 2){
        comp = "Scissors";
      } 
      
      
      
      // If input is rock
      if(input.equalsIgnoreCase("rock") && comp.equalsIgnoreCase("rock")){
        System.out.println("Computer played : " + comp);
        System.out.println("It is a tie!");
        System.out.println();
        tieCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      if(input.equalsIgnoreCase("rock") && comp.equalsIgnoreCase("paper")){
        System.out.println("Computer played : " + comp);
        System.out.println("Computer wins!");
        System.out.println();
        loseCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      if(input.equalsIgnoreCase("rock") && comp.equalsIgnoreCase("scissors")){
        System.out.println("Computer played : " + comp);
        System.out.println("You win!");
        System.out.println();
        winCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      
      
      
      //If input is paper
      if(input.equalsIgnoreCase("paper") && comp.equalsIgnoreCase("rock")){
        System.out.println("Computer played : " + comp);
        System.out.println("You win!");
        System.out.println();
        winCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      if(input.equalsIgnoreCase("paper") && comp.equalsIgnoreCase("paper")){
        System.out.println("Computer played : " + comp);
        System.out.println("It is a tie!");
        System.out.println();
        tieCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      if(input.equalsIgnoreCase("paper") && comp.equalsIgnoreCase("scissors")){
        System.out.println("Computer played : " + comp);
        System.out.println("Computer wins!");
        System.out.println();
        loseCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      
      
      
      //If input is scissors
      if(input.equalsIgnoreCase("scissors") && comp.equalsIgnoreCase("rock")){
        System.out.println("Computer played : " + comp);
        System.out.println("Computer wins!");
        System.out.println();
        loseCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      if(input.equalsIgnoreCase("scissors") && comp.equalsIgnoreCase("paper")){
        System.out.println("Computer played : " + comp);
        System.out.println("You win!");
        System.out.println();
        winCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      if(input.equalsIgnoreCase("scissors") && comp.equalsIgnoreCase("scissors")){
        System.out.println("Computer played : " + comp);
        System.out.println("It is a tie!");
        System.out.println();
        tieCount++;
        playCount++;
        System.out.println("Type either rock, paper or scissors. Type Stop to quit");
        input = scan.nextLine();
      }
      
      //If input is Stop
      if(input.equalsIgnoreCase("stop")){
        System.out.println("You pressed stop... Thanks for playing... See you soon!");
        break;
      }
    }
    
    //Prints out the Stats
    System.out.println();
    System.out.println("****************");
    System.out.println("   Your Stats   ");
    System.out.println("****************");
    System.out.println();
    System.out.println("Number of times you played: " + playCount);
    System.out.println("Number of times you won: " + winCount);
    System.out.println("Number of times you lost: " + loseCount);
    System.out.println("Number of times you tied: " + tieCount);
    
  }
  
} 