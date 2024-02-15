import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String menu = "Press 1 to balance checking \n"
				+ "Press 2 to withdraw money \n"
				+ "Press 3 to deposit money \n"
				+ "Press 4 to quit \n";
				
		Scanner scanner = new Scanner(System.in);
		
		String yaren_username = "ayren";
		String yaren_password = "123";
		String yaren_IBAN = "TR21 5364 7236 2634 87345 23 45";
		double yaren_balance = 3450;
		
		String mustafa_username = "mustuk"; 
		String mustafa_password = "456"; 
		String mustafa_IBAN = "TR32 9243 7623 8574 8945 54 89";
		double mustafa_balance = 0;
		
		System.out.println("WELCOME TO ATM APPLICATION!!");
		System.out.println("Please enter your information");
		
		System.out.print("Enter your user name: ");
		String user_name = scanner.nextLine();
		
		System.out.print("Enter your password: ");
		String user_password = scanner.nextLine();
		
		if (user_name.equals(yaren_username) && user_password.equals(yaren_password)) {
			System.out.println("Yaren Öztekin account was logged in");
			System.out.println(menu);
			System.out.print("Select the action you want to perform: ");
			String choice = scanner.nextLine();
			switch (choice) {
			case "1":
				System.out.println("Your balance is: " + yaren_balance);
				break;
				
			case "2":
				System.out.print("Enter the amount you want to withdraw: ");
				int loss_amount = scanner.nextInt();
				if (yaren_balance >= loss_amount) {
					yaren_balance -= loss_amount;
					System.out.println("your current balance: " + yaren_balance);
				}
				else {
					System.out.println("your balance is insufficient");
				}
				break;
				
			case "3":
				System.out.print("Enter the amount you want to deposit");
				int gain_amount = scanner.nextInt();
				if (gain_amount <= yaren_balance) {
					System.out.print("Enter the Iban number to which the money will be deposited:");
					String target_IBAN = scanner.nextLine();
					
					if (target_IBAN.equals(mustafa_IBAN)) {
						System.out.println("money is deposited into Mustafa Öztekin account");
						yaren_balance -= gain_amount;
						mustafa_balance += gain_amount;
						System.out.println("money was deposited. Your remaining balance: " + yaren_balance);
					}
					else {
						System.out.println("User not found");
					}
					
				} else {
					System.out.println("Your balance is insufficient for this transaction :(");
				}
				 break;
				
				
			 case "4":
				System.out.print("You are leaving ATM application.");
				System.out.println("See you later!");
				
			}
		} else if (user_name.equals(mustafa_username) && user_password.equals(mustafa_password)) {
			System.out.println("Mustafa Öztekin account was logged in");
			System.out.println(menu);
			System.out.print("Select the action you want to perform: ");
			String choice1 = scanner.nextLine();
			switch (choice1) {
			case "1":
				System.out.println("Your balance is: " + mustafa_balance);
				break;
				
			case "2":
				System.out.print("Enter the amount you want to withdraw: ");
				int loss_amount1 = scanner.nextInt();
				if (mustafa_balance >= loss_amount1) {
					mustafa_balance -= loss_amount1;
					System.out.println("your current balance: " + mustafa_balance);
				}
				else {
					System.out.println("your balance is insufficient");
				}
				break;
				
			case "3":
				System.out.print("Enter the amount you want to deposit");
				int gain_amount1 = scanner.nextInt();
				if (gain_amount1 <= mustafa_balance) {
					System.out.print("Enter the Iban number to which the money will be deposited:");
					String target_IBAN1 = scanner.nextLine();
					if (target_IBAN1.equals(yaren_IBAN)) {
						System.out.println("money is deposited into Yaren Öztekin account");
						yaren_balance -= gain_amount1;
						mustafa_balance += gain_amount1;
						System.out.println("money was deposited. Your remaining balance: " + mustafa_balance);
					}
					else {
						System.out.println("User not found");
					}
					
				} else {
					System.out.println("Your balance is insufficient for this transaction :(");
				}
				 break;
				
				
			 case "4":
				System.out.print("You are leaving ATM application.");
				System.out.println("See you later!");
			} // switch
		} // else if
		else {
			System.out.println("the app");
		}
	}
}		

