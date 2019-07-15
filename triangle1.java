
public class triangle1 extends geometricFig{
  public double side2;
  public double side3;
  public triangle1(double side1, double side2, double side3){
    super(side1);
    this.side2 = side2;
    this.side3 = side3;
  }
  @Override
  public void calcArea(){
    double semiPerm = ((side1+side2+side3)/2);
    double area1 = (semiPerm*(semiPerm-side1)*(semiPerm-side2)*(semiPerm-side3));
    this.area = Math.pow(area1, 0.5); 
  }
  public double getArea(){
    return area;
  }
  @Override
  public void calcPerimeter(){
    this.perimeter = side1+side2+side3;
  }
  public double getPerimeter(){
    return perimeter;
  }
  public String returnAtt(){
    return("Side 1: "+side1+" Side 2: "+side2+" Side 3: "+side3+" Area: "+area+" Perimeter: "+perimeter);
  }
}