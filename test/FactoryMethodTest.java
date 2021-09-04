import item1.Factory;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryMethodTest {

    @Test
    public void valueOf() {
        Boolean boxedClass = Factory.valueOf(true);
        assertEquals(Boolean.TRUE, boxedClass);
    }
}