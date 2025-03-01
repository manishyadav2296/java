public class SA extends Account{
    int min_bal=500;
    private int acc_id;
    private int acc_bal;
    public int getMin_bal() {
        return min_bal;
    }
    public void setMin_bal(int min_bal) {
        this.min_bal = min_bal;
    }
    public int getAcc_id() {
        return acc_id;
    }
    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }
    public int getAcc_bal() {
        return acc_bal;
    }
    public void setAcc_bal(int acc_bal) {
        this.acc_bal = acc_bal;
    }
    public void cal_Bal(){
        System.out.println(this.getAcc_Bal() - min_Bal);
    }
}


