public class Commission extends Employee
{
  public double commission = 0.0;
  
  public Commission (String eName, String eAddress, String ePhone, String socSecNumber, double rate){
    super(eName, eAddress, ePhone, socSecNumber, rate);
  }
  
  public void addCommission(double comm){
    commission = comm;  
  }
  
  public double pay(){
      
      double payment = super.pay() + commission;

      commission = 0;

      return payment;
   }
}
    