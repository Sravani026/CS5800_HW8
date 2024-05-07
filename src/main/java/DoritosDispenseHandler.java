public class DoritosDispenseHandler extends SnackDispenseHandler {

    public DoritosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getName().equals("Doritos")) {
            System.out.println("Dispensing Doritos...");
            snack.setQuantity(snack.getQuantity() - 1);
        } else {
            super.dispenseSnack(snack);
        }
    }
}
