import java.util.Scanner;
public class Tester{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first side.");
    double sidea = sc.nextDouble();
    System.out.println("Enter your second side.");
    double sideb = sc.nextDouble();
    squAtt sa = new squAtt(sidea, sideb);
    sa.calcArea();
    sa.calcPerimeter();
    System.out.println(sa.returnAtt());
    sa = null;//this is to prevent leakage of memory Pr33tham$
    
    System.out.println("Enter your first side.");
    double sidec = sc.nextDouble();
    System.out.println("Enter your second side.");
    double sided = sc.nextDouble();
    squAtt re = new squAtt(sidec, sided);
    re.calcArea();
    //System.out.println(re.getArea());
    re.calcPerimeter();
    System.out.println(re.returnAtt());
    re = null;
    
    double side1, side2, side3, side4, side5;
    System.out.println("Time for a regular pentagon...enter your sides!");
    System.out.println("Enter the first side.");
    side1 = sc.nextDouble();
    side2 = sc.nextDouble();
    side3 = sc.nextDouble();
    side4 = sc.nextDouble();
    side5 = sc.nextDouble();
    
    pentag pe = new pentag(side1, side2, side3, side4, side5);
    pe.calcPerimeter();
    pe.calcArea();
    pe.getPerimeter();
    System.out.println(pe.returnAtt());
    sc.close();
  }


}