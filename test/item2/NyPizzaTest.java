package item2;

import org.junit.Test;

import static item2.NyPizza.Size.SMALL;
import static item2.Pizza.Topping.ONION;
import static item2.Pizza.Topping.SAUSAGE;
import static org.junit.Assert.assertEquals;

public class NyPizzaTest {
    @Test
    public void builderTest() {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

        assertEquals(pizza.toppings.size(), 2);
    }
}