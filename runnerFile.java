import java.util.Scanner; 
public class runnerFile{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int figScan;
    System.out.println("What is your figure?\n1. Triangle\n2. Square\n3. Rectange\n4. Pentagon");
    figScan = sc.nextInt();
    if(figScan==1){
          //Scanner sc = new Scanner(System.in);
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
    }else if(figScan==2){
      double sideLength;
      //Scanner sc = new Scanner(System.in);
      System.out.println("What is the side of the square? ");
      sideLength = sc.nextDouble();
      squareA s1 = new squareA(sideLength);
      String a = s1.getArea();
      System.out.println(a);
      String b =s1.getPerimeter();
      System.out.println(b);
    }else if(figScan==3){
      double length1, width1;
      //Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of your rectangle. ");
      length1 = sc.nextDouble();
      System.out.println("Enter the width of your rectange. ");
      width1 = sc.nextDouble();
      rectagle r1 = new rectagle(length1, width1);
      String ad = r1.getArea();
      String as = r1.getPerimeter();
      System.out.println(ad);
      System.out.println(as);
    }else if(figScan==4){
      //Scanner sc = new Scanner(System.in);
      double sidelol;
      System.out.println("Enter the length of your 1st side. ");
      sidelol = sc.nextDouble();
      regPentagon p1 = new regPentagon(sidelol);
      String go = p1.getArea();
      String hi = p1.getPerimeter();
      System.out.println(go);
      System.out.println(hi);
    }else{
      System.out.println("You have entered a number that does not exist in this directory..try again!");
    }
    
sc.close();
  }
}