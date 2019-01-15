package day2;

public class Administrator {

	public static void main(String[] args) {
//		Employee secondemployee = new Employee();
//		secondemployee.id;
		Employee firstemployee = new Employee("Solui", "Nexlisia", 2000);
		firstemployee.empcount = 3;
		//due to empcount not being set to private in original class, it can be modiefied from here.
		Employee secondemployee = new Employee("Jactis", "Valdeur", 2000);
	}

}
