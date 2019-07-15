public class scaTriangle{
  private double sideA, sideB, sideC, perimeter, area;
  public scaTriangle(double sideLe, double sideDe, double sideHat){
    sideA = sideLe;
    sideB = sideDe;
    sideC = sideHat;
  }
  public String getArea(){
    double semiPerm = ((sideA+sideB+sideC)/2);
    double area1 = (semiPerm*(semiPerm-sideA)*(semiPerm-sideB)*(semiPerm-sideC));
    area = Math.pow(area1, 0.5);
    return ("The area of your triangle is "+area);
  }
  public String getPerimeter(){
    perimeter = (sideA+sideB+sideC);
    return ("The perimeter of your triangle is "+perimeter);
  }
}