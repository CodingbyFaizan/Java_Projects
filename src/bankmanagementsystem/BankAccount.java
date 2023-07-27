package bankmanagementsystem;

public class BankAccount {
	int accountNumber;
	String accountHolderName;
	double balance;

	public void createAccount(String name, int amt) {
		this.accountHolderName = name;
		this.balance = amt;
		this.accountNumber ++;
	}

	public void deposit(int depositamt) {
			this.balance += depositamt;
			System.out.println("Deposit successful. Updated Balance: " + this.balance);
		
	}

	public void withdrawal(int amt) {
		
			this.balance -= amt;
			System.out.println("Withdrawal successful. Updated Balance:" + this.balance);
		
	}

	public void balanceInquiry() {
		
			System.out.println("Account Balance: " + this.balance);
	}

	public void getDetails() {
		System.out.println("Account Number: " + this.accountNumber);
		System.out.println("Account Holder: " + this.accountHolderName);
		System.out.println("Current Balance:" + this.balance);

	}
	
	public int isValidAccount(int num) {
		if(this.accountNumber == num) {
			return 1;
		}
		else 
			return 0;
	}

}
