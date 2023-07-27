package bankmanagementsystem;

import java.util.Scanner;

public class BankAccountManagement {

	public static void main(String[] args) {

//		int depositamt;
		String name;
		int num;

		BankAccount ba = new BankAccount();

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Bank Account Management System!");

		while (true) {

			System.out.println("1. Create New Account");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Check Balance");
			System.out.println("5. View Account Details");
			System.out.println("6. Exit");

			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter your name: ");
//				sc.nextLine();
				name = sc.nextLine();
//				sc.nextLine(); // Consume the newline character
				System.out.println("Enter intial deposit amount: ");
				int depositamt1 = sc.nextInt();
				sc.nextLine();
				
				ba.createAccount(name, depositamt1);
				System.out.println("Account created successfully.");
				ba.getDetails();
				break;
			case 2:
				System.out.println("Enter account number:");
				num = sc.nextInt();
				int flag2 = ba.isValidAccount(num);
				if (flag2 == 1) {
					System.out.println("Enter deposit amount:");
					int depositamt2 = sc.nextInt();
					ba.deposit(depositamt2);
				} else {
					System.out.println(" Invalid account number!");
				}
				break;
			case 3:
				System.out.println("Enter account number:");
				num = sc.nextInt();
				int flag3 = ba.isValidAccount(num);
				if (flag3 == 1) {
					System.out.println("Enter withdrawal amount:");
					int amt = sc.nextInt();
					ba.withdrawal(amt);
				}else {
					System.out.println(" Invalid account number!");
				}

				break;

			case 4:
				System.out.println("Enter account number:");
				num = sc.nextInt();
				int flag4 = ba.isValidAccount(num);
				if (flag4 == 1) {
					ba.balanceInquiry();
				}else {
					System.out.println(" Invalid account number!");
				}
				break;

			case 5:
//				System.out.println("Enter account number:");
//				num = sc.nextInt();
				System.out.println("Enter account number:");
				num = sc.nextInt();
				int flag5 = ba.isValidAccount(num);
				if (flag5 == 1) {
					ba.getDetails();
				}else {
					System.out.println(" Invalid account number!");
				}
				break;

			case 6:
				System.out.println("Thank you for using Bank Account Management System!");
				System.exit(0);

			default:
				System.out.println("Invalid choice!");
				break;

			}
		}

		// main & class ends here
	}

}
