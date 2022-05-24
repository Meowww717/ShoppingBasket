package products;

public class Orange extends Fruit {
    private static double price = 32.0;
    private static String name = "Orange";

    public Orange() {
        super(price, name);
    }

    public static double calculateTotalPrice(int amount) {
        return amount * price;
    }
}
