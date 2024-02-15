import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * midterm1 %30
		 * midterm2 %30
		 * final    %40
		 * minimum 60 to pass the class
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("enter your surname: ");
		String surname = scanner.nextLine();
		
		System.out.print("Enter your first midterm grade: ");
		Double midterm1 = scanner.nextDouble();
		
		System.out.print("Enter your second midterm grade: ");
		Double midterm2 =  scanner.nextDouble();
		
		System.out.print("Enter your final exam grade: ");
		Double finalexam = scanner.nextDouble();
		
		Double result = (midterm1*0.3) + (midterm2 * 0.3) + (finalexam*0.4);
		
		if (result >= 60) {
			System.out.println(name + " " + surname + " passed the course with a " + result + " GPA");
		}
		else {
			System.out.println("Maybe next somestır.(Said Cihat teacherımız.)");
		}
		
		
		
		
		
		
	}

}
