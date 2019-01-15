import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter grade: ");
		String grade = input.next();
		
		switch(grade)
		{
		case "A":
			System.out.println("Superb!");
			break;
		case "B":
			System.out.println("Great!");
			break;
		case "C":
			System.out.println("Good!");
			break;
		case "D":
			System.out.println("You're on thin ice!");
			break;
		default:
			System.out.println("How hard did you even have to fail to end up with this?");
		}
	}

}
