// driver class 
import java.util.Scanner;
public class Test  
{ 
    public static void main(String args[])  
    { 
        Scanner sc = new Scanner(System.in);
        int gear1, speed1, starth;  
        System.out.println("You are creating a motor cycle. Please enter your initial gear, speed, and seat height one after the other.");
        gear1 = sc.nextInt();
        speed1 = sc.nextInt();
        starth = sc.nextInt();
        MountainBike mb = new MountainBike(gear1, speed1, starth); 
        System.out.println(mb.toString()); 
        
        mb.gearChange();
        mb.incrementS();
        System.out.println(mb.toString()); 
        
        sc.close();
    } 
}