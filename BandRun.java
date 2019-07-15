// ****************************************************************
//   BandRun.java
//
//   Use BandBooster class to get boxes sold each week
//   and compute weekly wages
//          
// ****************************************************************

import java.util.Scanner;
public class BandRun{
  public static void main(String[]args){
    String name, name1;
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the name of the first BandBooster?");
    name = sc.nextLine();
    System.out.println("What is the name of the second BandBooster?");
    name1 = sc.nextLine();
    BandBooster b1 = new BandBooster(name);
    BandBooster b2 = new BandBooster(name1);
    int week1, week2, week3;
    System.out.println("Enter the boxes sold by "+name+" in the first week.");
    week1 = sc.nextInt();
    b1.updateSales(week1);
    System.out.println("Enter the boxes sold by "+name+" in the second week.");
    week2 = sc.nextInt();
    b1.updateSales(week2);
    System.out.println("Enter the boxes sold by "+name+" in the third week.");
    week3 = sc.nextInt();
    b1.updateSales(week3);
    
    System.out.println("Enter the boxes sold by "+name1+" in the first week.");
    week1 = sc.nextInt();
    b2.updateSales(week1);
    System.out.println("Enter the boxes sold by "+name1+" in the second week.");
    week2 = sc.nextInt();
    b2.updateSales(week2);
    System.out.println("Enter the boxes sold by "+name1+" in the third week.");
    week3 = sc.nextInt();
    b2.updateSales(week3);
    String a = b1.toString();
    String b = b2.toString();
    System.out.println(a);
    System.out.println(b);
    sc.close();
    sc.close();
    sc.close();
  }
}