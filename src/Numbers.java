import java.util.Arrays;

public class Numbers {
	public static void main(String[] args) {
//		double A = 4.5;
//		double B = 5.6;
//		double C = A + B;
//		
//		/*int result = 5;
//		
//		char W = 'P';
//		
//		String hecc = "yeet";
//		*/
//		
//		System.out.printf("The square root of %.3f is %.3f", 4.0, Math.sqrt(4));
//		System.out.println(Math.sqrt(4));
		//System.out.println(Math.random()*10);
		
		int[] numbers = {3, 8, 10, 2, 7, 5};
		System.out.println("Before sorting: " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("After sorting: " + Arrays.toString(numbers));
	}
}
