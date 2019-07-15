// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and return a string containing student’s info. 
// ****************************************************************
import java.util.Scanner;

public class Student
{
  private int test1;
  private int test2;
  private double average;
  private String name;
    //declare instance data 
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
      studentName = name; 
 //add body of constructor
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("What was your first test score? ");
      test1 = sc.nextInt();
      System.out.println("What was your second test score? ");
      test2 = sc.nextInt();
 //add body of inputGrades
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public double getAverage(){
 //add body of getAverage
      return ((test1 + test2)/2.0);
    }
    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------
    //add header for printName
    public void getName()
    {
      System.out.println(name);
 //add body of printName
    }
}
 
