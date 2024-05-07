public class Main {
    public static void main(String[] args) {

        Snack coke = new Snack("Coke", 2.5, 8);
        Snack pepsi = new Snack("Pepsi", 2.5, 10);
        Snack cheetos = new Snack("Cheetos", 4.0, 6);
        Snack doritos = new Snack("Doritos", 4.5, 0);
        Snack kitkat = new Snack("Kitkat", 3.5, 3);
        Snack snickers = new Snack("Snickers", 3.0, 2);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitkat);
        vendingMachine.addSnack(snickers);

        System.out.println("\n=> Case 1: Trying to buy with more money than required");
        vendingMachine.idle();
        vendingMachine.waitingForSelection(snickers);
        vendingMachine.waitingForMoney(4.5);
        vendingMachine.dispensingSnack();

        System.out.println("\n=> Case 2: Trying to buy with exact money");
        vendingMachine.idle();
        vendingMachine.waitingForSelection(snickers);
        vendingMachine.waitingForMoney(3.0);
        vendingMachine.dispensingSnack();

        System.out.println("\n=> Case 3: Trying to buy a snack with insufficient money");
        vendingMachine.idle();
        vendingMachine.waitingForSelection(cheetos);
        vendingMachine.waitingForMoney(3.0);

        System.out.println("\n=> Case 4: Trying to buy a snack that is not available");
        vendingMachine.idle();
        vendingMachine.waitingForSelection(doritos);
        vendingMachine.waitingForMoney(4.5);
        vendingMachine.dispensingSnack();

        System.out.println("\n=> Case 5: Case where quantity is 0 for Snickers");
        vendingMachine.idle();
        vendingMachine.waitingForSelection(snickers);
        vendingMachine.waitingForMoney(3.5);
        vendingMachine.dispensingSnack();
        }
}