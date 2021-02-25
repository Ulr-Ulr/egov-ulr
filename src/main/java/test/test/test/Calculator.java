package test.test.test;

public class Calculator {
	static double pi = 3.14;
	private int r;
	private String color;
	static int sum1to10;
	static {
		for(int i=1;i<=10;i++) {
			sum1to10 += i;
		}
		
	}
	public Calculator(String color) {
		this.color = color;
	}
	public static int plus(int x, int y) {
		return x+y;		
	}
	public static double plus(double x, double y) {
		return x+y;		
	}
	public static int minus(int x, int y) {
		return x-y;
	}
	public static double minus(double x, double y) {
		return x-y;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getR() {
		return r;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	
}
