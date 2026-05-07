package outils_libre_lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
//في السابق
//  Runs : 3/3  Errors: 0 Failures: 0
//بعد التعديل
// Runs : 3/3  Errors: 0 Failures: 0
//نستنتج ان تغيير لم ياثر في عملية التنفيذ يعني تغيير في اسماء الكود لا تغير في النتيجة لكن هذا ساعد في تبسيط فهم الكود وجعل فهم طريقة عمل الكود اسرع من الاول  
    @Test
    public void testCalculate_basicValues() {
        Calculator calculator = new Calculator();
         //calc(2,4) = (2+4)/(2*4) = 6/8 = 0.75
        //في السابق
        //assertEquals(0.75, calculator.clc(2, 4), 0.0001);
        //في الكود الحالي
        //calaulateSumOverProduct(2,4) = (2+4)/(2*4) = 6/8 = 0.75
        assertEquals(0.75, calculator.calaulateSumOverProduct(2, 4), 0.0001);
    }

    @Test
    public void testCalculate_withOne() {
        Calculator calculator = new Calculator();
        // calc(1,3) = (1+3)/(1*3) = 4/3
        //في السابق
        //assertEquals(1.333, calculator.calc(1, 3), 0.001);
        //في الكود الحالي
        //calaulateSumOverProduct(1, 3)= (1+3)/(1*3) = 4/3
        assertEquals(1.333, calculator.calaulateSumOverProduct(1, 3), 0.001);
    }

    @Test
    public void testCalculate_symmetry() {
        Calculator calculator = new Calculator();
        //في الكود السابق
        // calc(a,b) == calc(b,a)
        //assertEquals(calculator.calc(3, 5), calculator.calc(5, 3), 0.0001);
        //في الكود الحالي
        //calaulateSumOverProduct(a,b) == calaulateSumOverProduct(b,a)
        assertEquals(calculator.calaulateSumOverProduct(3, 5), calculator.calaulateSumOverProduct(5, 3), 0.0001);
    }
}
