//*********************************************************************
// StudentGrades.java
// This program helps me learn how to print values without hard-coding them
// and also help me with tab spaces
//*********************************************************************

public class StudentGrades{
  public static void main(String[]args){
    int joeLab = 43;
    int williamLab = 50;
    int marySueLab = 39;
    int robbieLab = 93;
    int nachiketLab = 99;
    int himanshuLab = 90;
    int joeBonus = 7;
    int williamBonus = 8;
    int marySueBonus = 10;
    int robbieBonus = 7;
    int nachiketBonus = 1;
    int himanshuBonus = 10;
    int joeTotal = joeLab + joeBonus;
    int williamTotal = williamLab + williamBonus;
    int marySueTotal = marySueLab + marySueBonus;
    int robbieTotal = robbieLab + robbieBonus;
    int nachiketTotal = nachiketLab + nachiketBonus;
    int himanshuTotal = himanshuLab + himanshuBonus;
    System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    System.out.println("==          Student Points          ==");
    System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
    System.out.println("Name\t\t\tLab\t\tBonus\t\tTotal");
    System.out.println("====\t\t\t===\t\t=====\t\t=====");
    System.out.println("Joe\t\t\t"+joeLab+"\t\t"+joeBonus+"\t\t"+joeTotal);
    System.out.println("William\t\t\t"+williamLab+"\t\t"+williamBonus+"\t\t"+williamTotal);
    System.out.println("Mary Sue\t\t\t"+marySueLab+"\t\t"+marySueBonus+"\t\t"+marySueTotal);
    System.out.println("Robbie\t\t\t"+robbieLab+"\t\t"+robbieBonus+"\t\t"+robbieTotal);
    System.out.println("Nachiket\t\t\t"+nachiketLab+"\t\t"+nachiketBonus+"\t\t"+nachiketTotal);
    System.out.println("Himanshu\t\t\t"+himanshuLab+"\t\t"+himanshuBonus+"\t\t"+himanshuTotal);
   }
}
