package day2;

public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private String position;
	private double salary;
	public static int empcount;
	

	public Employee() {
		
	}
	
	public Employee(String firstname, String lastname, double salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		empcount++;
		displayEmpDetails();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void displayEmpDetails() {
		System.out.println("Employee " + firstname + " " + lastname + ", $" + salary + " " + empcount);
	}
	public void EmpCount() {
		empcount++;
	}
	
	public int getEmpcount() {
		return empcount;
	}

	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}

	public static void main(String args[]) {
		Employee firstemployee = new Employee("Solui", "Nexlisia", 2000);
		Employee secondemployee = new Employee("Jactis", "Valdeur", 2000);
		Employee thirdemployee = new Employee("Jublix", "forgot her name lol", 1500);
		
		//System.out.println(getEmpcount());
		
	}

}


