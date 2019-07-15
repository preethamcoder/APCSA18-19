public class pentag extends geometricFig{
  public double side2;
  public double side3;
  public double side4;
  public double side5;
  
  public pentag(double side1, double side2, double side3, double side4, double side5){
    super(side1);
    this.side2 = side2;
    this.side3 = side3;
    this.side4 = side4;
    this.side5 = side5;
  }
  @Override
  public void calcPerimeter(){
    this.perimeter = side1+side2+side3+side4+side5;
  }
  public double getPerimeter(){
    return perimeter;
  }
  @Override
  public void calcArea(){
    this.area = 5*(Math.pow(3, 0.5))*side1*(side1/4);
  }
  public double getArea(){
    return area;
  }
  public String returnAtt(){
    return("Side 1: "+side1+" Side 2: "+side2+" Side 3: "+side3+" Side 4: "+side4+" Side 5: "+side5+" Area: "+area+" Perimeter: "+perimeter);
  }

}