package day2;

public class FullTimeStaff extends Employee {
	private int leave;
	
	public FullTimeStaff(String firstname, String lastname, double salary, int leave) {
		super (firstname, lastname, salary);
		this.leave = leave;
	}
	
	public int getLeave() {
		return leave;
	}

	public void setLeave(int leave) {
		this.leave = leave;
	}
	
	
	public static void main(String args[]) {
		FullTimeStaff firstemployee = new FullTimeStaff("Solui", "Nexlisia", 2000, 7);
		System.out.println(firstemployee.leave);
	}
	
}
