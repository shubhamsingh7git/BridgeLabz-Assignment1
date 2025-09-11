package Keywords_Level1;

class BankAccount{
	static String bankName = "SBI Bank";
	private static int totalAccounts=0;
	static void getTotalAccounts() {
		System.out.println("Total account created: "+totalAccounts);
	}
	
	private String accountHolderName;
	private final int accountNumber;
	private double balance;
	
	BankAccount(String accountHolderName, int accountNumber, double balance){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		this.balance=balance;
		totalAccounts++;
	}
	
	void displayDetails() {
		if(this instanceof BankAccount) {
			System.out.println("Bank: " + bankName);
			System.out.println("Account Holder: " + this.accountHolderName);
			System.out.println("Account Number: " + this.accountNumber);
			System.out.println("Balane: " + this.balance);
		}
		else {
			System.out.println("Not a valid bank account object");
		}
	}
}

public class Q1 {
	public static void main(String[]args) {
		BankAccount acc1=new BankAccount("Shubham Singh",123456,10000.00);
		BankAccount acc2= new BankAccount("Nitin Goyal",789012,10000.00);
		acc1.displayDetails();
		System.out.println();
		acc2.displayDetails();
		System.out.println();
		BankAccount.getTotalAccounts();
		
		
	}

}
