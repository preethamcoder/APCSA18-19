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
student1.getAverage();
 System.out.println("Student 1 " +student1);

 //input grades for Mike
 student2.inputGrades();
 //print average for Mike
 student1.inputGrades();
    }
}

