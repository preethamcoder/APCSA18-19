// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//          
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    { 
 Student student1 = new Student("Mary");
 //create student2, "Mike"
Student student2 = new Student("Mike");
 //input grades for Mary
 student1.inputGrades();
//print average for Mary
 String boi = student1.toString();
 System.out.println(boi);

 //input grades for Mike
 student2.inputGrades();
 //print average for Mike
 String ace = student2.toString();
 System.out.println(ace);
    }
}











