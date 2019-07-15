// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.text.NumberFormat; 
import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

      Item item;
      String itemName;
      double itemPrice;
      int quantity;
      
      double totalPrice = 0.00;
      
      ArrayList <Item> cart = new ArrayList <Item>();
      
      
      
      String keepShopping = "y";
      
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      
      while (keepShopping.equals("y")){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the name, price, and the quantity of the item: ");
        itemName = scan.nextLine();
        itemPrice = scan.nextDouble();
        quantity = scan.nextInt();
        
        // *** create a new item and add it to the cart
        item = new Item(itemName, itemPrice, quantity);
        cart.add(item);
        
        totalPrice += (item.getPrice() * item.getQuantity());
          
        // *** print the contents of the cart object using println
                    
        String contents = "\n\t\t\tShopping Cart\n--------------------------------------------------------------------";
        contents += "\nNumber of iteams in the cart: " + cart.size() + "\n--------------------------------------------------------------------\n";
        contents += "\nItem\t\t\t\tUnit Price\tQuantity\tTotal\n______________________________________________________________________\n";
        for(int i = 0; i < cart.size(); i++){
          contents += cart.get(i).toString() + "\n";
        }
        
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        
        System.out.println(contents); 
        
        System.out.print ("Continue shopping (y/n)? ");
        keepShopping = scan.next();
        
         scan.close();
      }
      System.out.println("\nPlease pay "+ fmt.format(totalPrice)+" at the counter. \n Thanks for shopping!");
    }
}