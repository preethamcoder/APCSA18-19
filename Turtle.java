import java.awt.*;
/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  
  
//This program helped me learn how to use a turtle to   
  
  public static void main(String[] args)
  {
    
    //P
    /*preetham.setPenWidth(10);
    preetham.forward(100);
    preetham.turnRight();
    preetham.forward(50);
    preetham.turnRight();
    preetham.forward(50);
    preetham.turnRight();
    preetham.forward(50);
    
    //A
    preetham.penUp();
    preetham.turnLeft();
    preetham.forward(50);
    preetham.turnLeft();
    preetham.forward(75);
    preetham.turnLeft();
    preetham.penDown();
    preetham.setPenWidth(15);
    preetham.setPenColor(Color.blue);
    preetham.forward(100);
    preetham.turnRight();
    preetham.forward(50);
    preetham.penDown();
    preetham.turnRight();
    preetham.forward(50);
    preetham.turnRight();
    preetham.forward(50);
    preetham.turnLeft();
    preetham.turnLeft();
    preetham.penUp();
    preetham.penDown();
    preetham.forward(50);
    preetham.turnRight();
    preetham.forward(100);
    
    //T
    preetham.turnLeft();
    preetham.penUp();
    preetham.forward(50);
    preetham.turnLeft();
    preetham.penDown();
    preetham.setPenColor(Color.red);
    preetham.setPenWidth(5);
    preetham.forward(100);
    preetham.turnLeft();
    preetham.forward(35);
    preetham.turnRight();
    preetham.turnRight();
    preetham.forward(70);
    preetham.hide();*/

    //drawTriangle();
    drawSquareb();
  }

  /*public static void drawTriangle(){
    
    World earth = new World();
    Turtle preetham = new Turtle(earth);
    for(int i = 0; i<2; i++){
      
      preetham.turn(60);
      preetham.forward(180);
    }
    preetham.turn(150);
    preetham.forward(295);
  }*/
  
      
  public static void drawSquareb(){
      World earth = new World();
    Turtle preetham = new Turtle(earth);
    //preetham.moveTo(200,320);
      preetham.setPenColor(Color.blue);
      for(int i = 1; i<=4;i++){
        preetham.forward(120);
        preetham.turnRight();
      }
      preetham.penUp();
      preetham.forward(120);
      preetham.penDown();
      for(int i = 0, i<2, i++){
        preetham.turn(30);
        preetham.forward((120*1.73));
        
      }
      
    }
      
} // this } is the end of class Turtle, put all new methods before this