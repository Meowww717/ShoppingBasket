package products;

public class Banana extends Fruit {
    private static double price = 51.0;
    private static String name = "Banana";
    private static String specialOffer;

    public Banana() {
        super(price, name);
    }

    public static double calculateTotalPrice(int amount) {
        int quantityAfterSpecialOffer = calculateSpecialOfferAmount(amount);
        return quantityAfterSpecialOffer * price;
    }

    public static int calculateSpecialOfferAmount(int amount) {
        int quantityAfterSpecialOffer = 0;
        if(amount >= 3) {
            int reminderQuantity = amount % 3;
            if(reminderQuantity == 0) {
                quantityAfterSpecialOffer = (amount / 3) * 2;
                specialOffer = "You've got " + amount / 3 + " banana(s) for free";
            } else if(reminderQuantity == 1) {
                quantityAfterSpecialOffer = (amount / 3) * 2 + 1;
                specialOffer = "You've got " + amount / 3 + " banana(s) for free.";
            } else if(reminderQuantity == 2) {
                quantityAfterSpecialOffer = (amount / 3) * 2 + 2;
                specialOffer = "You've got " + amount / 3 + " banana(s) for free, and you can take one more";
            }
        } else {
            quantityAfterSpecialOffer = amount;
            if (quantityAfterSpecialOffer == 2) {
                specialOffer = "You can take one banana for free.";
            }
        }

        System.out.println();
        System.out.println("Special offer for you:  " + specialOffer);

        return quantityAfterSpecialOffer;
    }
}
