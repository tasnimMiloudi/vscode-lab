package outils_libre_lab;

import org.junit.Test;
import static org.junit.Assert.*;
//قبل التعديل
//Runs: 3/3 Errors: 0 Failures: 0
// finished after 0.053s
//بعد التعديل
//Runs: 3/3 Errors: 0 Failures: 0
//finished after 0.049s
//نلاحظ ان مدة التنفيذ قد نقصت عن السابق
public class EmployeeTest {
//    @Test
//    public void testManagerBonus() {
//        Employee emp = new Employee();
//        assertEquals(5000, emp.calculateBonus("Manager"), 0.01);
//    }
//
//    @Test
//    public void testDeveloperBonus() {
//        Employee emp = new Employee();
//        assertEquals(3000, emp.calculateBonus("Developer"), 0.01);
//    }
//
//    @Test
//    public void testInternBonus() {
//        Employee emp = new Employee();
//        assertEquals(1000, emp.calculateBonus("Intern"), 0.01);
//    }
	 @Test
	    public void testManagerBonus() {
	        Employee emp = new Manager();
	        assertEquals(5000, emp.calculateBonus(), 0.01);
	    }

	    @Test
	    public void testDeveloperBonus() {
	        Employee emp = new Developer();
	        assertEquals(3000, emp.calculateBonus(), 0.01);
	    }

	    @Test
	    public void testInternBonus() {
	        Employee emp = new Intern();
	        assertEquals(1000, emp.calculateBonus(), 0.01);
	    }
}
