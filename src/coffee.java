public class coffee {
    int money;
    public void setMoney(int money){
        this.money=money;
    }
    public int getMoney(){
        return this.money;
    }
    public int coffee_machine(int money, int coffee){
        if(money==0)
            return 0; //no money returns no coffee
        else if(coffee==0 || (coffee < money))
            return money; //no available coffee so return money
        else if(money>0 && money==coffee)
            return coffee; //1 money unit = 1 coffee
        else return -1;
    }
}
