import java.util.ArrayList;
import java.util.Scanner;

public class Arraysmore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		
		for (int i=0;i<5;i++) {
			System.out.println("Give a number: ");
			mylist.add(input.nextInt());
		}
		for (int j=0; j<5;j++) {
			System.out.println("The number entered is: " +mylist.get(j));
		}
	} 

}
