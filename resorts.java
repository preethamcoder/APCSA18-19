// ***************************************************************
//   Resorts.java
//   It helps me lern the usage of cascading if statements and
//   logical operator together.
// ***************************************************************
import java.util.Scanner;

public class resorts{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    double temp;
    System.out.println("What is the temperature outside?");
    temp = sc.nextDouble();
    //System.out.println(temp);
    {
    if(temp>95){
      System.out.println("Visit our shops beacuse it is "+temp+" degrees.");
    }else if(temp>=80){
      System.out.println("Go swimming because it is "+temp+" degrees.");
    }else if(temp>=60){
      System.out.println("Play tennis because it is "+temp+" degrees.");
    }else if(temp>=40){
      System.out.println("Play golf because it is "+temp+" degrees.");
    }else if(temp>=20){
      System.out.println("Go skiing because it is "+temp+" degrees.");      
    }else{
      System.out.println("Visit our shops because it is "+temp+" degrees.");
    }
    
    }
   sc.close();
  }
}
