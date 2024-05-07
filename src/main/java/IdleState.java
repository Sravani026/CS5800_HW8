public class IdleState implements StateOfVendingMachine {

    public void idle(VendingMachine vendingMachine) {
        System.out.println("Let's Start!!");
        vendingMachine.setStateOfVendingMachine(new WaitingForSelectionState());
    }

    public void waitingForSelection(VendingMachine vendingMachine) {
        System.out.println("Please make a selection.");
    }

    public void waitingForMoney(VendingMachine vendingMachine) {
        System.out.println("Please make a selection first.");
    }

    public void dispensingSnack(VendingMachine vendingMachine) {
        System.out.println("Please make a selection and insert money.");
    }

}