package Java_Class_And_Objects.Level2;

public class Q7 {

    public static class BankAccount {

        String accountHolder;
        int accountNumber;
        double balance;

        BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }
        
        void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient balance!");
            } else {
                System.out.println("Invalid withdrawal amount!");
            }
        }

        void display() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: " + balance);
            
        }
    }

    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Ravi Kumar", 12345, 5000);

        obj1.display();
        obj1.deposit(2000);
        obj1.withdraw(1500);
        obj1.withdraw(7000);
        obj1.display();
    }
}