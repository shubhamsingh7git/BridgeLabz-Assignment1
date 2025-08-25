package section_F.Day_2;

class Account{
	String accountHolder;
	int balance;
	
	void show() {
		System.out.println("accountHolder : " + this.accountHolder + ", balance : " + this.balance);
	}
}

public class Q9 {
	public static void main(String...args) {
		Account obj1 = new Account();
		obj1.show();
	}
}