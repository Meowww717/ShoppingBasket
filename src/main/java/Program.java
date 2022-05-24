import products.Apple;
import products.Banana;
import products.Orange;
import products.Pineapple;

public class Program {
    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();

        basket.addFruit(new Apple());
        basket.addFruit(new Apple());
        basket.addFruit(new Orange());
        basket.addFruit(new Apple());
        basket.addFruit(new Pineapple());
        basket.addFruit(new Banana());
        basket.addFruit(new Orange());
        basket.addFruit(new Banana());

        double totalPrice = basket.calculateTotalPrice();

        System.out.println();
        System.out.println("Total price of all products " + totalPrice + " pounds");
    }
}
