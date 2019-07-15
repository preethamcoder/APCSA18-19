import java.util.Scanner; 
public class scaTriRun{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double side1, side2, side3;
    System.out.println("Enter the length of your 1st side. ");
    side1 = sc.nextDouble();
    System.out.println("Enter the length of your 2nd side. ");
    side2 = sc.nextDouble();
    System.out.println("Enter the length of your 3rd side. ");
    side3 = sc.nextDouble();
    
    scaTriangle t2 = new scaTriangle(side1, side2, side3);
    String g = t2.getArea();
    String h = t2.getPerimeter();
    System.out.println(g);
    System.out.println(h);
  }
}