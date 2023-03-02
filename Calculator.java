package week1.day2.ass3;

public class Calculator {
       int a1, a2;
       double a3;
       float a4;
       
       public void additionTwoNumber(int a,int b) {
       a1 = a + b;
       System.out.println(a1);
       }
       
       public void substractionTwoNumber(int e, int f) {
    	   a2 = e - f;
    	   System.out.println(a2);
       }
       
       public void multipleTwoNumber(double i, double k) {
    	   a3 = i * k;
    	   System.out.println(a3);
       }
       
       public void divideTwoNumber(float x, float y) {
    	   a4 = x/y;
    	   System.out.println(a4);
       }
       public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.additionTwoNumber(13, 26);
		calc.substractionTwoNumber(56, 34);
		calc.multipleTwoNumber(22, 12);
		calc.divideTwoNumber(32, 12);
		
       }
}
