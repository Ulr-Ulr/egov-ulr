package test.test.test;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator("빨강");
	myCalc.setR(4);
	double result1 = Calculator.pi*myCalc.getR()*myCalc.getR();
	System.out.println(result1);
	myCalc.setR(3);
	double result2 = 2*Calculator.pi*myCalc.getR();
	System.out.println(result2);
	System.out.println(Calculator.plus(result1,result2));
	System.out.println(Calculator.sum1to10, 2);
	}
		
		
		
}
