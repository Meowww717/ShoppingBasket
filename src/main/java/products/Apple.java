package products;

public class Apple extends Fruit {

    private static double price = 12.0;
    private static String name = "Apple";
    private static String specialOffer;

    public Apple() {
        super(price, name);
    }

    public static double calculateTotalPrice(int amount) {
        int quantityAfterSpecialOffer = calculateSpecialOfferAmount(amount);
        return quantityAfterSpecialOffer * price;
    }

    public static int calculateSpecialOfferAmount(int amount) {
        int quantityAfterSpecialOffer;
        if(amount >= 2) {
            if(amount % 2 == 0) {
                quantityAfterSpecialOffer = amount / 2;
                specialOffer = "You've got " + amount / 2 + " apple(s) for free";
            } else {
                quantityAfterSpecialOffer = (amount / 2) + 1;
                specialOffer = "You've got " + amount / 2 + " apple(s) for free, and you can take one more";
            }
        } else {
            quantityAfterSpecialOffer = amount;
            specialOffer = "You can take one apple for free.";
        }

        System.out.println();
        System.out.println("Special offer for you: " + specialOffer);

        return quantityAfterSpecialOffer;
    }
}
