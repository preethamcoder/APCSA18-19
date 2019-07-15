// ****************************************************************
//   BandBooster.java
//
//   Use BandBooster class to get boxes sold each week
//   and compute weekly wages
//          
// ****************************************************************

public class BandBooster{
  //2 data members
  //1 constructor putting boxes making 0
  //Get name method, returns the nae of band booster
  //upDate sales and adds boxes to number sold
  //toString to avoid HEXADECIMAL GOBBLEDYGOOK
  private String name;
  private int boxesSold;
  public BandBooster(String bbName){
    boxesSold = 0;
    name = bbName;
  }
  public String getName(){
    return name;
  }
  public void updateSales(int addedBox){
    boxesSold += addedBox;
  }
  public String toString(){
    return(name+" sold "+boxesSold+" boxes across the three weeks.");
  }
}