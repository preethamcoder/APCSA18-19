public class Student{
  private String name;
  private int rollNo;
  private double gradeP;
  private int sub1Gr;
  private int sub2Gr;
  
  public Student(String naame, int rollNom, int sub1Gra, int sub2Gra){
    name = naame;
    rollNo = rollNom;
    sub1Gr = sub1Gra;
    sub2Gr = sub2Gra;
    //gradeP = gradePe;
  }
  public double gpaCal(){
    //System.out.println(sub1Gr+sub2Gr);
    gradeP = (sub1Gr+sub2Gr)/2;
    return gradeP; 
  }
  /*public double getGpa(){
    return gradeP;
  }*/
  /*public String getName(){
    System.out.println(name);
    return(name);
  }*/
}
