//****************************************************************
// Name: Preetham Thelluri
// 
// Date: 1/16/19
//
// Item lab
//
// This deals with array lists and simulates a shopping session.
//****************************************************************
import java.text.NumberFormat;

public class Item {
  private String name;
  private double price;
  private int quantity;

  public Item (String itemName, double itemPrice, int itemQuant)
  {
    name=itemName;
    price = itemPrice;
    quantity = itemQuant;
  }

  public String toString()
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    return   ((String.format("%-20s", name)) + "\t\t\t\t"  +fmt.format(price)+"\t\t" + quantity+"\t\t"+fmt.format(quantity*price));
  }

  public String getName()
  {
    return name;
  }

  public double getPrice()
  {
    return price;
  }

  public int getQuantity()
  {
    return quantity;
  }
}