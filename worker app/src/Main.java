import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter ID: ");
		long ID = scanner.nextLong();
		scanner.nextLine();

		System.out.print("name: ");
		String name = scanner.nextLine();

		System.out.print("surname: ");
		String surname = scanner.nextLine();

		System.out.print("Experience(s): ");
		int experience = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Salary: ");
		double salary = scanner.nextDouble();
		scanner.nextLine();

		workers worker1 = new workers(ID, name, surname, experience, salary);
		
		String menu = "transactions:  \n" 
				+ "1- Show worker's information \n" 
				+ "2- Raise a salary \n"
				+ "3- Format it \n" 
				+ "q- Quit";

		boolean isValid = true;

		while (isValid) {
			
			System.out.println(menu);

			System.out.print("please enter a selection according to the menu: ");
			String choice = scanner.nextLine();

			switch (choice) {
			case "1":
				worker1.showInfo();
				System.out.println("-----------------------------");
				break;

			case "2":
				System.out.print("How much of a salary increase would you like to increase?: ");
				double raise = scanner.nextDouble();
				scanner.nextLine();

				worker1.raiseSalary(raise);
				System.out.println("-----------------------------");
				break;

			case "3":
				System.out.print("Enter the operating System: ");
				String os = scanner.nextLine();

				System.out.print("Who is currently formatting it: ");
				String whoString = scanner.nextLine();

				worker1.formatIt(os, whoString);
				System.out.println("-----------------------------");
				break;
			case "q":
				System.out.print("You are leaving... See you later!!");
				isValid = false;
				System.out.println("-----------------------------");
				break;
			default:
				System.out.println("You entered a value that is not in the menu");

			}
		}

	}

}
