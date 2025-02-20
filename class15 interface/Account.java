

 abstract class Bank{
    public  abstract void cal_bal();
    public String get_bank_Details(){ //concrete
        return "bank Details: sbi";
    }
}
 public class Account extends Bank{
    public void cal_bal(){
        System.out.println("calculating balance!please wait");

    
}
public static void main(String[] args ){
    Account a1=new Account();
    a1.cal_bal();
    System.out.println(a1.get_bank_Details());
}
 }