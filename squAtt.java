import java.util.Scanner;
public class squAtt extends geometricFig{
  Scanner sc = new Scanner(System.in);
  public double side2;
  public squAtt(double side1, double side2){
    super(side1);
    this.side2 = side2;
  }
  @Override
  public void calcArea(){
    this.area = side1 * side2;
    //return area;
  }
  public double getArea(){
    return area;
  }
  @Override
  public void calcPerimeter(){
    this.perimeter = 2*(side1+side2); 
  }
  public double getPerimeter(){
    return perimeter;
  }
  
  public String returnAtt(){
    return("Length: "+side1+" Width: "+side2+" Area: "+area+" Perimeter: "+perimeter);
  }
}