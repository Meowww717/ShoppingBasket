import products.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket {
    private static final String APPLE = "Apple";
    private static final String ORANGE = "Orange";
    private static final String BANANA = "Banana";
    private static final String PINEAPPLE = "Pineapple";

    private List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public Double calculateTotalPrice() {
        Map<String, Integer> amountOfFruits = convertToMapWithCount();
        final double[] totalPriceOfAllProducts = {0.0};

        amountOfFruits.forEach((s, integer) -> {
            totalPriceOfAllProducts[0] +=
                    calculateTotalPriceForEachProduct(s, integer);
        });

        return totalPriceOfAllProducts[0];
    }

    private double calculateTotalPriceForEachProduct(String fruitName,
                                                     Integer amount) {
        switch (fruitName) {
            case (APPLE):
                return Apple.calculateTotalPrice(amount);
            case (ORANGE):
                return Orange.calculateTotalPrice(amount);
            case (PINEAPPLE):
                return Pineapple.calculateTotalPrice(amount);
            case (BANANA):
                return Banana.calculateTotalPrice(amount);
        }
        return 0.0;
    }

    private Map<String, Integer> convertToMapWithCount() {
        Map<String, Integer> amountOfFruits = new HashMap<>();
        fruits.forEach(fruit -> {
            if (amountOfFruits.containsKey(fruit.getName())) {
                amountOfFruits.put(fruit.getName(),
                        amountOfFruits.get(fruit.getName()) + 1);
            } else {
                amountOfFruits.put(fruit.getName(), 1);
            }
        });
        return amountOfFruits;
    }
}
