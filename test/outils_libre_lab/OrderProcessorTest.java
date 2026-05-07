package outils_libre_lab;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
//في السابق
//   Runs : 3/3  Errors: 0 Failures: 0
// بعد التعديل
//  Runs : 3/3  Errors: 0 Failures: 0
//نستنتج ان تغيير لم ياثر في عملية التنفيذ يعني تغيير في اسماء الكود لا تغير في النتيجة لكن هذا ساعد في تبسيط فهم الكود وجعل فهم طريقة عمل الكود اسرع من الاول  
public class OrderProcessorTest {

    @Test
    public void testTotal_nonMember() {
        Customer customer = new Customer("Ali", false);
        Order order = new Order(customer, Arrays.asList(
            new Item("Book", 10.0, 2),  // 20.0
            new Item("Pen",  5.0,  3)   // 15.0
        ));
        OrderProcessor op = new OrderProcessor();
        assertEquals(35.0, op.calculateTotal(order), 0.01);
    }

    @Test
    public void testTotal_memberDiscount() {
        Customer customer = new Customer("Sara", true);
        Order order = new Order(customer, Arrays.asList(
            new Item("Laptop", 1000.0, 1)
        ));
        OrderProcessor op = new OrderProcessor();
        // 1000 * 0.9 = 900 (خصم 10% للأعضاء)
        assertEquals(900.0, op.calculateTotal(order), 0.01);
    }

    @Test
    public void testTotal_emptyOrder() {
        Customer customer = new Customer("Khalid", false);
        Order order = new Order(customer, Arrays.asList());
        OrderProcessor op = new OrderProcessor();
        assertEquals(0.0, op.calculateTotal(order), 0.01);
    }
}