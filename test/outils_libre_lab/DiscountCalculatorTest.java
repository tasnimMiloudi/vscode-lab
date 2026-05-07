package outils_libre_lab;

import org.junit.Test;
import static org.junit.Assert.*;
//قبل التعديل
//Runs: 3/3 Errors: 0 Failures: 0
//finished after 0.05s
//بعد التعديل 
//Runs: 3/3 Errors: 0 Failures: 0
//finished after 0.026s
//نلاحظ ان مدة قد نقصت
public class DiscountCalculatorTest {

    @Test
    public void testNoDiscount_belowMinimum() {
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(0.0, dc.calculateDiscount(50, false), 0.01);
    }

    @Test
    public void testDiscount_premiumCustomer() {
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(0.2, dc.calculateDiscount(200, true), 0.01);
    }

    @Test
    public void testDiscount_regularCustomer() {
        DiscountCalculator dc = new DiscountCalculator();
        assertEquals(0.1, dc.calculateDiscount(200, false), 0.01);
    }
}
