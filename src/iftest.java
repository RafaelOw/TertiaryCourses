import java.util.Scanner;

public class iftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 5;
//		int y = 2;
//
//		if (x < y) {
//			System.out.println("x is less than y");
//		} else if (x > y) {
//			System.out.println("x is more than y");
//		} else {
//			System.out.println("they are the same");
//		}
		
//		   
//				int totalorders = 150;
//				int discount;
//				
//				discount=(totaloders>100)?25:0;
//					System.out.println("discount= "+ discount);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter total sales: ");
		double totalsale = input.nextDouble();
		if (totalsale < 200) {
			System.out.println("Total sales is $" +totalsale);
		}
		else if (totalsale >= 200 && totalsale < 500) {
			double discount = 0.10;
			double checkout = totalsale-(totalsale*discount);
			System.out.println("Total sales is $" + checkout);
		}
		else {
			double discount = 0.20;
			double checkout = totalsale-(totalsale*discount);
			System.out.println("Total sales is $" + checkout);
		}
		
		//ALT ANSWER
		//Each if/else block only has discount=discountamount, and the Total sales along with the math is placed at the bottom outside of the blocks.
		//e.g System.out.println("Total sales is $" + totalsale-(totalsale*discount));
	}



}
