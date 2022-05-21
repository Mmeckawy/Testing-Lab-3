import junit.framework.TestCase;

public class coffeeTest extends TestCase {
    public void testCoffee_machine() {
        coffee c1 = new coffee();
        assertEquals(3, c1.coffee_machine(3, 3));
        //expected 3 coffee cups with 3 coffee available
    }

    public void testCoffee_machine1() {
        coffee c1 = new coffee();
        c1.setMoney(3);
        ATM A1 = new ATM();
        A1.setAmount(3);
        assertEquals(3, c1.coffee_machine(A1.getAmount(), 3));
        //expected 3 coffee cups with 3 coffee available
    }
    public void testCoffee_machine2() {
        ATM A1 = new ATM();
        coffee c1  = new coffee();
        Digital_watch D1 = new Digital_watch(14,37,22);
        A1.setWithdrawHour(D1.getHour());
        A1.setWithdrawMin(D1.getMin()+1);
        A1.setWithdrawSec(D1.getSec()+30);
        A1.setAmount(15);

        assertEquals(15, c1.coffee_machine(A1.getAmount(), 15));
        assertEquals(38,A1.getMin());
        assertEquals(52,A1.getSec());
        //pass test
    }
    public void testCoffee_machine3() {
        coffee c1 = new coffee();
        assertEquals(1, c1.coffee_machine(0, 2));
        //test should fail because there is no money available
    }
    public void testCoffee_machine4() {
        coffee c1 = new coffee();
        assertEquals(2, c1.coffee_machine(2, 4));
        //machine should return coffee because there is enough money and coffee
    }
    public void testCoffee_machine5() {
        coffee c1 = new coffee();
        assertEquals(0, c1.coffee_machine(2, 0));
        //expected no coffee to return because there is no coffee available
    }
    public void testCoffee_machine6() {
        coffee c1 = new coffee();
        assertEquals(4, c1.coffee_machine(4, 0));
        //test should fail because it shouldn't return coffee when there is no coffee available
    }
    public void testCoffee_machine7() {
        coffee c1 = new coffee();
        assertEquals(1, c1.coffee_machine(0, 0));
        //test should fail because there is neither money nor coffee available
    }
    public void testCoffee_machine8() {
        coffee c1 = new coffee();
        assertEquals(4,c1.coffee_machine(4,3));
        //test will return money because there is no enough coffee
    }
}
