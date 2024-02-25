
public class workers {

	public long ID;

	public String name;

	public String surname;

	public int experiences;

	public double salary;

	public workers(long ID, String name, String surname, int experiences, double salary) {

		this.ID = ID;
		this.name = name;
		this.surname = surname;
		this.experiences = experiences;
		this.salary = salary;

	}

	public void showInfo() {

		System.out.println("ID: "              + ID);
		System.out.println("Name: "            + name);
		System.out.println("Surname: "         + surname);
		System.out.println(((experiences > 1) ? "experiences: " : "experience: ")  + experiences);
		System.out.println("Salary: "          + salary);

	}

	public void raiseSalary(double raise) {
		
		System.out.println("Your salary had been increased by " + raise + " TL");
		System.out.println("your current salary: " + (salary + raise) + " TL. Bon apetit!");

	}
	
	public void formatIt(String operatingSystem , String who) {
		System.out.println(who + " is currently formatting " + operatingSystem + " operating system.");
	}
	
	

}
