public class KitkatDispenseHandler extends SnackDispenseHandler {
    public KitkatDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("KitKat")) {
            System.out.println("Dispensing KitKat...");
            snack.setQuantity(snack.getQuantity() - 1);
        } else {
            super.dispenseSnack(snack);
        }
    }
}

