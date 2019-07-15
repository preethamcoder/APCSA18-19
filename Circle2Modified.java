//*******************************************************************************************
//  Circle2Modified.java
//  Print the area of a circle with two different radii and change in area and circumference
//*******************************************************************************************
import java.util.Scanner;

public class Circle2Modified
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       double firstArea; 
       double area; 
       double changeInArea, changeInCircum;
       double firstCircumference;
       double circumference;
       int radius;
       int radius2;
       System.out.println("Enter the value of radius. ");
       radius = sc.nextInt();
       final double PI = 3.14159;
       //int radius = 10;
       
       firstCircumference = 2*PI*radius;
       firstArea = PI * radius * radius;

       System.out.println("The circumference of a circle with radius "+ radius + " is " + firstCircumference +" units.");
       System.out.println("The area of a circle with radius " + radius +
                        " is " + firstArea+ " units squared");
       
       
       //System.out.println("Enter the value of the second radius. ");
       //radius2 = sc.nextInt();
       radius2 = 2*radius;
       System.out.println("Your second radius is "+radius2+" units.");
       circumference = 2*PI*radius2;
       area = PI * radius2 * radius2;
       changeInArea = area/firstArea;
       changeInCircum = circumference/firstCircumference;
       System.out.println("The circumference of a circle with radius "+ radius2 + " is " + circumference+ " units.");
       System.out.println("The area of a circle with radius " + radius2 +
                        " is " + area+" units squared");
       System.out.println("Area changes by a factor of "+changeInArea+" when the radius doubles.");
       System.out.println("Circumference changes by a factor of "+changeInCircum+" when the radius doubles.");
       sc.close();
       //The result from the previous program Circle2 holds true
    }
}

