// derived class 
import java.util.Scanner;
class MountainBike extends Bicycle  
{ 
      Scanner sc = new Scanner(System.in);
    // the MountainBike subclass adds one more field 
    public int seatHeight; 
  
    // the MountainBike subclass has one constructor 
    public MountainBike(int gear,int speed, 
                        int startHeight) 
    { 
        // invoking base-class(Bicycle) constructor 
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
          
    // the MountainBike subclass adds one more method 
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    }  
    public int gearChange(){
      System.out.println("What do you want the gear to change by? ");
      int change = sc.nextInt();
      gear += change;
      return gear;
    }
    
    // overriding toString() method 
    // of Bicycle to print more info 
    public int incrementS(){
      System.out.println("What number do you want the speed to be incremented by? ");
      int swag = sc.nextInt();
      speed += swag;
      return speed;
    }
    @Override
    public String toString() 
    { 
        return (super.toString()+ 
                "\nseat height is "+seatHeight); 
    } 
      
} 
  
