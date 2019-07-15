//*******************************************************************************************
//  Circle2.java
//  Print the area of a circle with two different radii and change in area and circumference
//*******************************************************************************************

public class Circle2
{
    public static void main(String[] args)
    {
       double firstArea; 
       double area; 
       double changeInArea, changeInCircum;
       double firstCircumference;
       double circumference;
       
        
       final double PI = 3.14159;
       int radius = 10;
       
       firstCircumference = 2*PI*radius;
       firstArea = PI * radius * radius;

       System.out.println("The circumference of a circle with radius "+ radius + " is " + firstCircumference);
       System.out.println("The area of a circle with radius " + radius +
                        " is " + firstArea);
       
       
       
       radius = 20;
       circumference = 2*PI*radius;
       area = PI * radius * radius;
       changeInArea = area/firstArea;
       changeInCircum = circumference/firstCircumference;
       System.out.println("The circumference of a circle with radius "+ radius + " is " + circumference);
       System.out.println("The area of a circle with radius " + radius +
                        " is " + area);
       System.out.println("Area changes by a factor of "+changeInArea+" when the radius doubles.");
       System.out.println("Circumference changes by a fctor of "+changeInCircum+" when the radius doubles.");
    }
}

