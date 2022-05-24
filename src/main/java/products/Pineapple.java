package products;

public class Pineapple extends Fruit {
    private static double price = 95.0;
    private static String name = "Pineapple";

    public Pineapple() {
        super(price, name);
    }

    public static double calculateTotalPrice(int amount) {
        return amount * price;
    }
}
