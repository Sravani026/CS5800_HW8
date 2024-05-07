public class WaitingForSelectionState implements StateOfVendingMachine {

    public void idle(VendingMachine vendingMachine) {
        System.out.println("Vending machine reset to idle.");
    }

    public void waitingForSelection(VendingMachine vendingMachine) {
        System.out.println("Please select a snack:");
        vendingMachine.printAllSnacks();

        vendingMachine.printSnackDetails();

        System.out.println("Your Order - " + vendingMachine.getSelectedSnack());
        vendingMachine.setStateOfVendingMachine(new WaitingForMoneyState());
    }

    public void waitingForMoney(VendingMachine vendingMachine) {
        System.out.println("You haven't selected a snack, please do it first!!");
    }

    public void dispensingSnack(VendingMachine vendingMachine) {
        System.out.println("Please select a snack and insert money");
    }

}

