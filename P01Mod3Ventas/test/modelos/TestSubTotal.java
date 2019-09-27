package modelos;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestSubTotal {

    @Test
    public void testSubTotal() {
        System.out.println("SubTotal");
        Venta instance = new Venta("1", 8, 2);
        int expResult = 16;
        int result = instance.SubTotal();
        assertTrue(instance.SubTotal() == 16);
    }

}
