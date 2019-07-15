import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.awt.Color;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  
  
  
  public void drawFace()
  {
    Graphics g = this.getGraphics();
    g.setColor(Color.BLACK);
    g.fillRect(100,10,400,90);
    g.setColor(Color.PINK);
    g.drawRect(100,100,300,500);
    g.fillRect(100,100,300,500);
    g.setColor(Color.GREEN);
    g.drawOval(130,140,80,80);
    g.drawOval(290,140,80,80);
    //g.setColor(Color.WHITE);
    g.fillOval(290,140,80,80);
    g.fillOval(130,140,80,80);
    g.setColor(Color.BLACK);
    g.fillOval(140,170,50,50);
    g.drawOval(140,170,50,50);
    g.fillOval(310,170,50,50);
    g.drawOval(310,170,50,50);
    //g.drawOval(9,9,30,30);
    g.setColor(Color.BLUE);
    g.setColor(Color.YELLOW);
    g.fillRect(220,290,55,90);
    g.drawRect(220,290,55,90);
    g.setColor(Color.BLACK);
    g.drawRect(175,470,150,76);
    g.setColor(Color.WHITE);
    g.fillRect(175,470,150,38);
    g.fillRect(175,508,150,38);
    g.setColor(Color.BLACK);
    g.drawRect(175,470,30,76);
    g.drawRect(205,470,30,76);
    g.drawRect(235,470,30,76);
    g.drawRect(265,470,30,76);
    g.drawRect(295,470,30,76);
    g.drawRect(175,470,150,38);
   }
 
  public static void main(String[] args) 
  {
   Picture pict = new Picture(FileChooser.pickAFile());
   pict = new Picture("C:\\Users\\2000121193\\OneDrive - Fulton County Schools\\AP CSA\\Chapter 2\\Face.PNG");
                                 
   pict.drawFace();
   pict.explore();
  }
  
  
} // this } is the end of class Picture, put all new methods before this