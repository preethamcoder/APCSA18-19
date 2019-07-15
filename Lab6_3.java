//*****************************************************************************
// Lab6_3
//
// gets an array, reverses the values, and changes the order of storing them.
//*****************************************************************************
import java.util.Scanner;
//import java.util.Arrays;
public class Lab6_3{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter the length of your array. ");
    a = sc.nextInt();
    int [] array = new int [a];
    System.out.println("Enter your elements one after the other. ");
    for(int i = 0; i<a; i++){
      array[i] = sc.nextInt();
    }
    System.out.println("This is the original array. ");
    for(int i = 0; i<a; i++){
      System.out.print(""+array[i]+" ");
    }
    
    for(int i = 0; i < a/ 2; i++){
      int t = array[i];
      array[i] = array[a - i - 1];
      array[a - i - 1] = t;
}
    System.out.println("\nThis is the reversed array. ");
    for(int i = 0; i<a; i++){
      System.out.print(""+array[i]+" ");
    }
    System.out.println("");
    
    sc.close();
  }
}