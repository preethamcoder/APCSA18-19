//**************************************************************
// Lab6_2
//
// gets an array to store the quiz key and and grades quizzes.
//**************************************************************

import java.util.Scanner;
import java.text.NumberFormat;

public class Lab6_2{
  public static void main(String[]args){
    System.out.println("Welcome to the quiz grading appication!");
    Scanner sc = new Scanner(System.in);
    
    int numQs;
    System.out.println("How many question on your quiz? ");
    numQs = sc.nextInt();
    int [] key = new int[numQs];
    int ans; 
    System.out.println("Enter your answers.");
    for(int i = 0; i < numQs; i++){
      ans = sc.nextInt();
      key[i] = ans;
    }
    int studR;
    int [] sR = new int[numQs];
    for(int i = 0; i <numQs; i++){
      System.out.println("Enter the student's answers. ");
      studR = sc.nextInt();
      sR[i] = studR;
    }
    double numCorrect = 0;
    for(int i = 0; i < numQs; i++){
      if(sR[i]==key[i]){
        numCorrect += 1;
      }
    }
    NumberFormat percent = NumberFormat.getPercentInstance();
    Scanner scan = new Scanner(System.in);
    System.out.println("He has "+numCorrect+" correct answers, which accounts to his score being "+(percent.format(numCorrect/numQs)));
    System.out.println("Would you like to grade another quiz? (yes/no)");
    String resp;
    resp = scan.nextLine();
    while(resp.equals("yes")){
      //int [] sR = new int[numQs];
    for(int i = 0; i <numQs; i++){
      System.out.println("Enter the student's answers. ");
      studR = sc.nextInt();
      sR[i] = studR;
    }
    numCorrect = 0;
    for(int i = 0; i < numQs; i++){
      if(sR[i]==key[i]){
        numCorrect += 1;
      }
    }
    System.out.println("He has "+numCorrect+" correct answers, which accounts to his score being "+((percent.format(numCorrect/numQs))));
    System.out.println("Would you like to grade another quiz? (yes/no)");
    resp = scan.nextLine();
    }
//System.out.println("Would you like to grade more quizzes? (yes / no) \nEntering any other value of this question would result in termination of the program. So, enter wisely.");
    /*String ab = sc.nextLine();
    ga = ab;*/
    sc.close();
    scan.close();
  }
}
