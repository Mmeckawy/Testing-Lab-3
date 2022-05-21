import junit.framework.TestCase;

public class ATMTest extends TestCase {

    public void testWithdraw() {
        ATM A1 = new ATM();
        assertEquals(20,A1.withdraw(20,300));
        //Test would pass because it passes all the required parameters
    }
    public void testWithdraw1() {
        ATM A1 = new ATM();
        coffee c1  = new coffee();
        c1.setMoney(20);
        assertEquals(c1.getMoney(),A1.withdraw(20,300));
        //we integrated coffee class with ATM
        //Test would pass because it passes all the required parameters
    }
    public void testWithdraw2() {
        ATM A1 = new ATM();
        assertEquals(200,A1.withdraw(200,100));
        //Test would fail because there is no available balance
    }
    public void testWithdraw3() {
        ATM A1 = new ATM();
        assertEquals(100,A1.withdraw(100,100));
        //Test would pass because it passes all the required parameters
    }
    public void testWithdraw4() {
        ATM A1 = new ATM();
        assertEquals(200,A1.withdraw(100,300));
        //Test would fail because machine cannot withdraw an amount more than chosen by the user
    }

    public void testAddAmount() {
        ATM A1 = new ATM();
        assertEquals(400,A1.addAmount(100,300));
        //Test would pass because it passes all the required parameters
    }
    public void testAddAmount2() {
        ATM A1 = new ATM();
        assertEquals(200,A1.addAmount(100,300));
        //Test would fail because the amount was not added to the balance correctly
    }
    public void testAddAmount3() {
        ATM A1 = new ATM();
        assertEquals(500,A1.addAmount(100,300));
        //Test would fail because the amount was not added to the balance correctly
    }
}