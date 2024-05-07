import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AllClassesTest {

    @Test
    public void testAddSnack() {
        VendingMachine vendingMachine = new VendingMachine();
        Snack coke = new Snack("Coke", 2.5, 8);
        vendingMachine.addSnack(coke);
        assertEquals(1, vendingMachine.getSnacks().size());
    }

    @Test
    public void testIdleState() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.idle();
        assertEquals("WaitingForSelectionState", vendingMachine.getStateOfVendingMachine().getClass().getSimpleName());
    }

    @Test
    public void testWaitingForSelectionState() {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.waitingForSelection(new Snack("Coke", 2.5, 8));
        assertEquals("IdleState", vendingMachine.getStateOfVendingMachine().getClass().getSimpleName());
    }

    @Test
    public void testWaitingForMoneyState() {
        VendingMachine vendingMachine = new VendingMachine();
        Snack selectedSnack = new Snack("Coke", 2.5, 8);
        vendingMachine.setSelectedSnack(selectedSnack);
        vendingMachine.waitingForMoney(2.5);
        assertEquals("IdleState", vendingMachine.getStateOfVendingMachine().getClass().getSimpleName());
        // Test that the selected snack's quantity has decreased after waiting for money
        assertEquals(8, selectedSnack.getQuantity());
    }

    @Test
    public void testDispensingSnackState() {
        VendingMachine vendingMachine = new VendingMachine();
        Snack selectedSnack = new Snack("Coke", 2.5, 8);
        vendingMachine.setSelectedSnack(selectedSnack);
        vendingMachine.setMoney(2.5);
        vendingMachine.dispensingSnack();
        // Test that the selected snack's quantity has decreased after dispensing
        assertEquals(8, selectedSnack.getQuantity());
    }

    @Test
    public void testSnackDispenseHandlers() {
        Snack coke = new Snack("Coke", 2.5, 8);
        SnackDispenseHandler dispenser = new CokeDispenseHandler(null);
        dispenser.dispenseSnack(coke);
        assertEquals(7, coke.getQuantity());
    }

    @Test
    public void testMain() {
        // Test main method, expecting no errors
        String[] args = {};
        Main.main(args);
    }
}
