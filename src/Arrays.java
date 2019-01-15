import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] ages = {19, 21, 23, 28};
//		System.out.println(ages[2]);
			
		
//		double[] prices = new double[5];
//		Scanner checkout = new Scanner(System.in);
//		System.out.println("Give 5 prices ");
//		prices[0] = checkout.nextDouble();
//		prices[1] = checkout.nextDouble();
//		prices[2] = checkout.nextDouble();
//		prices[3] = checkout.nextDouble();
//		prices[4] = checkout.nextDouble();
//		
//		for (int i=0; i<prices.length;i++)
//		{
//			System.out.println(prices[i]);
//		}
//		
//		double total = prices[0]+prices[1]+prices[2]+prices[3]+prices[4];
//		System.out.println("Your total is: " + total);
		
		//ALT ANSWER
		System.out.println("Give 5 prices ");
		double total = 0;
		
		double[] prices = new double[5];
		for (int i=0;i<5;i++)
		{
			Scanner checkout = new Scanner(System.in);	
			prices[i] = checkout.nextDouble();
		}
		for (int j=0;j<5;j++)
		{
			total = total+prices[j];
		}
		System.out.println("Your total is " + total);
		
	}
	


}
