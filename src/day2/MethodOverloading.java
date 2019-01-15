package day2;

public class MethodOverloading {
	
	public static int quads(int a) {
		return a*a;
	}
	
	public static int quads(int a, int b) {
		return a*b;
	}
	
	public static void main(String args[]) {
	
	int a = 4;
	int b = 5;
	int result1 = quads(a);
	int result2 = quads(a,b);
//	double c = 7.3;
//	double d = 9.4;
//	int result1 = minFunction(a,b);
//	double result2 = minFunction(c,d);
	System.out.println("Minimum value: " + result1);
	System.out.println("Mimimum value: " + result2);
//	
//	public static int minFunction(int a, int b) {
//		return a+b;
//	}
//	public static double minFunction(double c, double d) {
//		return c+d;
//		
//	}
	}
}
