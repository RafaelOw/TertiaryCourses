package day2;

public class PartTimeStaff extends Employee {
	
	private int hourly;
	
	public int getHourly() {
		return hourly;
	}

	public void setHourly(int hourly) {
		this.hourly = hourly;
	}

	public PartTimeStaff(String firstname, String lastname, double salary, int hourly) {
		super (firstname, lastname, salary);
		this.hourly = hourly;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee secondemployee = new PartTimeStaff("Jactis", "Valdeur", 0, 9);
		secondemployee.displayEmpDetails();
	}

}
