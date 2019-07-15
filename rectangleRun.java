import java.util.Scanner;
public class rectangleRun{
  public static void main(String[]args){
    double length1, width1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of your rectangle. ");
    length1 = sc.nextDouble();
    System.out.println("Enter the width of your rectange. ");
    width1 = sc.nextDouble();
    rectagle r1 = new rectagle(length1, width1);
    
    String ad = r1.getArea();
    String as = r1.getPerimeter();
    System.out.println(ad);
    System.out.println(as);
  }
}