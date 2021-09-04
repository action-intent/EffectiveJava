package item2;

import org.junit.Test;

import static item2.Pizza.Topping.HAM;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalzonePizzaTest {
    @Test
    public void builderTest() {
        CalzonePizza pizza = new CalzonePizza.Builder().addTopping(HAM).sauceInside().build();

        assertEquals(pizza.toppings.size(), 1);
        assertTrue(pizza.isSauceInside());
    }
}