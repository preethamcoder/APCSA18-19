public class rectagle{
  private double length, width, area, perimeter;
  public rectagle(double len, double wid){
    this.length = len;
    this.width = wid;
  }
  public void calcPerimeter(){
    perimeter = 2*(length+width);
  }
  public String getPerimeter(){
    return("The perimeter of your reactangle is "+perimeter+" square units.");
  }
  public void calcArea(){
    area = length*width;
  }
  public String getArea(){
    return("The area of your rectangle is "+area+" square units.");
  }
  public String returnAtt(){
    return("Length: "+length+" Width: "+width+" Area: "+area+" Perimeter: "+perimeter);
  }
}