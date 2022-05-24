import org.junit.Before;
import org.junit.Test;
import products.Apple;
import products.Banana;
import products.Orange;
import products.Pineapple;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {
    private ShoppingBasket basket1;
    private ShoppingBasket basket2;
    private ShoppingBasket basket3;

    @Before
    public void setUp() {
        basket1 = new ShoppingBasket();
        basket1.addFruit(new Banana());
        basket1.addFruit(new Banana());
        basket1.addFruit(new Banana());
        basket1.addFruit(new Banana());
        basket1.addFruit(new Banana());
        basket1.addFruit(new Banana());

        basket2 = new ShoppingBasket();
        basket2.addFruit(new Apple());
        basket2.addFruit(new Apple());
        basket2.addFruit(new Orange());
        basket2.addFruit(new Pineapple());
        basket2.addFruit(new Banana());

        basket3 = new ShoppingBasket();
        basket3.addFruit(new Apple());
        basket3.addFruit(new Apple());
        basket3.addFruit(new Orange());
        basket3.addFruit(new Apple());
        basket3.addFruit(new Pineapple());
        basket3.addFruit(new Banana());
        basket3.addFruit(new Orange());
        basket3.addFruit(new Banana());
    }

    @Test
    public void calculateTotalPriceTest() {
        double totalPriceForBasket1 = basket1.calculateTotalPrice();
        double totalPriceForBasket2 = basket2.calculateTotalPrice();
        double totalPriceForBasket3 = basket3.calculateTotalPrice();

        assertEquals(204.0, totalPriceForBasket1, 0);
        assertEquals(190.0, totalPriceForBasket2, 0);
        assertEquals(285.0, totalPriceForBasket3, 0);

    }
}
