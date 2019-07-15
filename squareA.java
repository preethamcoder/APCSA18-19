public class squareA{
 private double side; 
 private double area;
 private double perimeter; 
 
 public squareA(double sidez){
   side = sidez;
 }
 public String getArea(){
   area = side*side;
   return ("The area of your square is "+area+" square units.");
 }
 public String getPerimeter(){
   perimeter = 4*side;
   return ("The perimeter of your square is "+perimeter+" units.");
 }
}
