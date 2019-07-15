import java.util.Scanner;
public class squareRun{
  public static void main(String[]args){
    double sideLength;
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the side of the square? ");
    sideLength = sc.nextDouble();
    squareA s1 = new squareA(sideLength);
    
     String a = s1.getArea();
     System.out.println(a);
    String b =s1.getPerimeter();
    System.out.println(b);
  }
}