// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student�s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
  //declare instance data
  private String name;
  private double score1;
  private double score2;
  private double average;
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
      name = studentName;
 //add body of constructor
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
      //add body of inputGrades
      Scanner sc = new Scanner(System.in);
      System.out.println("What is the first test score? ");
      score1 = sc.nextDouble();
      System.out.println("What is the second test score? ");
      score2 = sc.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public double getAverage()
    {
      average = (score1+score2)/2;
      return average;
 //add body of getAverage
    }
    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    public String getName()
    {
      return(name);
 //add body of printName
    }
    public String toString(){
      /*System.out.println(name);
      System.out.println(score1);
      System.out.println(score2);
      return ("Preetham");*/
      return("Name: "+name+" \t Test1: "+score1+"\t Test2: "+score2+"\t Average: "+getAverage());
    }
    
}
 