// ***********************************************************************
//   TestNames.java
//
//   Use Name class to get names, first, middle, and last. 
//   String comparison and will return output if the names are the same.      
// ***********************************************************************
import java.util.Scanner;
public class TestNames{
  public static void main(String[]args){   
    String firstName, middleName, lastName;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first person's first name. ");
    firstName = sc.nextLine();
    System.out.println("Enter the first person's middle name. ");
    middleName = sc.nextLine();
    System.out.println("Enter the first person's last name. ");
    lastName = sc.nextLine();
    Name rollname1 = new Name(firstName, middleName, lastName);
    String firstName1, middleName1, lastName1;
    System.out.println("Enter the second person's first name. ");
    firstName1 = sc.nextLine();
    System.out.println("Enter the second person's middle name. ");
    middleName1 = sc.nextLine();
    System.out.println("Enter the second person's last name. ");
    lastName1 = sc.nextLine();
    System.out.println("**********************************************************");
    Name rollname2 = new Name(firstName1, middleName1, lastName1);
    String a = rollname1.firstMiddleLast();
    String b = rollname2.firstMiddleLast();
    System.out.println(a);
    System.out.println(b);
    String c = rollname1.lastFirstMiddle();
    String d = rollname2.lastFirstMiddle();
    System.out.println(c);
    System.out.println(d);
    String e = rollname1.initials();
    String f = rollname2.initials();
    System.out.println(e);
    System.out.println(f);
    int g = rollname1.length();
    int h = rollname2.length();
    System.out.println(firstName+"'s name is "+g+" characters long.");
    System.out.println(firstName1+"'s name is "+h+" characters long.");
    if(rollname1.equals(rollname2)){
      System.out.println("The names are the same.");
    }else{
      System.out.println("The names are not the same.");
    }
  }
}