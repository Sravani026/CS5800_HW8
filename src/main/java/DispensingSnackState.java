public class DispensingSnackState implements StateOfVendingMachine {

    public void idle(VendingMachine vendingMachine) {
    }

    public void waitingForSelection(VendingMachine vendingMachine) {
    }

    public void waitingForMoney(VendingMachine vendingMachine) {
    }

    public void dispensingSnack(VendingMachine vendingMachine) {
        int quantity = vendingMachine.getSelectedSnack().getQuantity();
        double money = vendingMachine.getMoney();
        double price = vendingMachine.getSelectedSnack().getPrice();
        if (quantity > 0) {
            System.out.println("Dispensing " + vendingMachine.getSelectedSnack().getName() + "...");
            vendingMachine.getSelectedSnack().setQuantity(quantity - 1);
            if (money > price) {
                System.out.println("Returning change $" + (money - price));
            }
        } else {
            System.out.println("Sorry, " + vendingMachine.getSelectedSnack().getName() + " is out of stock.");
            System.out.println("Returning money: $" + money);
        }
        vendingMachine.setStateOfVendingMachine(new IdleState());
        vendingMachine.setMoney(0.0);
        vendingMachine.setSelectedSnack(null);
    }

}