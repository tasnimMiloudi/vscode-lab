package outils_libre_lab;

public class DiscountCalculator {

    // قبل Refactoring
//    public double calculateDiscount(double totalAmount, boolean isPremium) {
//        double discount = 0.0;
//        if (totalAmount > 100) {
//            if (isPremium) {
//                discount = 0.2;
//            } else {
//                discount = 0.1;
//            }
//        }
//        return discount;
//    }
//   بعد Refactoring - Guard Clauses
	    public double calculateDiscount(double totalAmount, boolean isPremium) {
	        if (totalAmount <= 100) {
	            return 0.0;
	        }
	        if (isPremium) {
	            return 0.2;
	        }
	        return 0.1;
	    }
	
}
