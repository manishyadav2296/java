class Account{
     final int min_bal=500; //if final is used here then it will show error
    public static void main(String[] args) {
        Account a1=new Account();
        System.out.println(a1. min_bal);//500
        a1.min_bal=600;
        System.out.println(a1.min_bal);//600
    }
}
