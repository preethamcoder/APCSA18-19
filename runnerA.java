public class runnerA{
  public static void main(String[]args){
    triangle1 t1 = new triangle1(2, 3, 4);
    t1.calcArea();
    t1.calcPerimeter();
    System.out.println(t1.returnAtt());
    t1 = null;//this is to prevent leakage of memory Pr33tham$
    triangle1 t2 = new triangle1(2.0, 2.0, 2.0);
    t2.calcArea();
    //System.out.println(re.getArea());
    t2.calcPerimeter();
    System.out.println(t2.returnAtt());
    t2 = null;
  }
}