public class ATM {
    int amount,total,hour,min,sec;
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setTotal(int total){
        this.total=total;
    }
    public int getTotal(){
        return this.total;
    }
    public int withdraw(int amount, int total){
        if(amount<=total) {
            this.amount = amount;
            this.total = total;
            return amount;
            //return withdraw amount if there is available amount in the account's total balance
        }
        else
            return 0;
    }
    public int addAmount(int amount, int total){
        if(amount>0) {
            this.amount = amount;
            this.total = total;
            return amount + total;
            //If user enters a positive amount of money, it is added to his account balance
        }
        else return 0;
    }
    public void setWithdrawHour(int hour){
        this.hour=hour;
    }
    public void setWithdrawMin(int min){
        this.min=min;
    }
    public void setWithdrawSec(int sec){
        this.sec=sec;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
}
