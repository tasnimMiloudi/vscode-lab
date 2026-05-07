package outils_libre_lab;

public class Calculator {

//	public double calc(double a, double b) {
//        double x = a + b;
//        double y = a * b;
//        return x / y;
//    }
//
//    public void prtRes(double res) {
//        System.out.println("Result: " + res);
//    }
	  public double calaulateSumOverProduct(double num1, double num2) {
          double sum = num1 + num2;
          double product = num1 * num2;
          return sum / product;
      }
	  public void printtResult(double result) {
        System.out.println("Result: " + result);
    }
}
