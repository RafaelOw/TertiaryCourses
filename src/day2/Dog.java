package day2;

public class Dog extends Animal{
	public Dog(int id, String name) {
	super(id,name);
	}

	public void Talk() {
		System.out.println("woof woof");
	}
	
	public void Walk() {
		System.out.println("Let's walk");
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(2,"Berry");
		
		dog1.Walk();
		dog1.Talk();

	}

}
