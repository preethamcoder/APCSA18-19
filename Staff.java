import java.text.NumberFormat;
public class Staff
{
  private StaffMember[] staffList;
  NumberFormat money = NumberFormat.getCurrencyInstance();
  
  public Staff(){
  staffList = new StaffMember[11];
  staffList[0] = new Executive ("Mr. Hatcher", "123 Polymorphic Land", "770-769-6997", "123-45-6789", 100000);
  staffList[1] = new Employee ("Ms. Xie", "432 No Woman's Place", "912-432-0091", "123-43-1234", 65000);
  staffList[2] = new Employee ("Mr. Ruppel", "545 Random Community", "678-123-7890", "456-65-3234", 45000);
  staffList[3] = new Hourly ("Mr. Niverthi", "657 Duval Street", "770-345-6748", "672-70-8906", 10.00);
  staffList[4] = new Hourly ("Mr. Gokhare", "321 Some Random Street", "443-892-4341", "789-24-8975", 12.00);
  staffList[5] = new Commission ("Mr. Pujari", "121 Now Run Street", "404-787-7342", "133-87-7834", 75000);
  staffList[6] = new Commission ("Mr. Juang", "348 Alpharetta Street", "202-873-3479", "432-23-3423", 125000);
  staffList[7] = new Volunteer("Ms. McClelland", "2 College Base Road", "786-786-7860");
  staffList[8] = new Volunteer("Mr. Sanchez", "9 College Base Road", "765-783-8193");
  staffList[9] = new Commission("Ms. Petry", "786 Regan Road", "504-893-8733", "982-89-8734", 85000);
  staffList[10] = new Employee("Mr. Thelluri", "7306 Collingwood Lane", "470-388-7556", "1111-00-1111", 30000);
  
    ((Executive)staffList[0]).awardBonus(25000);
    ((Hourly)staffList[3]).addHours(41);
    ((Hourly)staffList[4]).addHours(38);
    ((Commission)staffList[5]).addCommission(1500);
    ((Commission)staffList[6]).addCommission(12000);
    ((Commission)staffList[9]).addCommission(1000);
  }
    
    public void payday(){
      double amount;
      
      for(StaffMember count: staffList){
        System.out.println(count);
        
        amount = count.pay();
        
        if (amount == 0.0)
          System.out.println("Thanks!");
        else
          System.out.println("Paid: " + money.format(amount));
        
        System.out.println("*********************************************");
      
             
    
  
      }
  }
}