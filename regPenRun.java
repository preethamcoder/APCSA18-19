import java.util.Scanner; 
public class regPenRun{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double sidelol;
    System.out.println("Enter the length of your 1st side. ");
    sidelol = sc.nextDouble();
    
    regPentagon p1 = new regPentagon(sidelol);
    String go = p1.getArea();
    String hi = p1.getPerimeter();
    System.out.println(go);
    System.out.println(hi);
  }
}