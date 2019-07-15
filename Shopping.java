//*************************************************************************************************************************
// Shopping.class
//
// 
//*************************************************************************************************************************
import java.text.NumberFormat;
import java.util.Scanner;

public class Shopping
{
  public static void main (String[]args)
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    String sentinel = "y";
    //int count = 0;
    ShoppingCart cart = new ShoppingCart(5);
    //String itemNamed;
    while (sentinel.equalsIgnoreCase("y"))
    {
      Scanner scan = new Scanner (System.in);    //Scanner was moved inside because it had to be flushed everytime it was used.
      System.out.println("What do you want to add to the cart?\nPlease enter the name, price, and quantity of the item.");
      //System.out.println("Start of iteration. ");
      String itemNamed = scan.nextLine();
      //System.out.println("Items: "+itemNamed);
      double cuesta = scan.nextDouble();
      int quan = scan.nextInt();
      Item add = new Item (itemNamed, cuesta, quan);
      cart.addToCart(add);
      System.out.println(cart);
      System.out.println("Would you like to continue shopping? (y/n)");
      sentinel = scan.next();
      //count++;
      scan.close();
    }
    System.out.println("Total Price: "+fmt.format(cart.getTotal()));
    System.out.println("\nPlease pay "+fmt.format(cart.getTotal())+" at the counter. \n Thanks for shopping!");
  }
}


