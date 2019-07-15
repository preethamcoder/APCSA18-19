public class geometricFig{
  public double side1;
  //public double side2;
  public double area;
  public double perimeter;
  
  public geometricFig(double side1){
    this.side1 = side1;
    System.out.println("Base class constructor.");
  }
  public void calcArea(){
  
  }
  public void calcPerimeter(){
    
  }
  public String getAtt(){
    return(side1+" "+area+" "+perimeter);
  }
}