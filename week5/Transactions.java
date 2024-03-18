package week5;

public class Transactions {
    public static void main(String[] args) {
        // Example with an initial balance
        Account account1 = new Account("John Doe", 123456, 1000.0);
        System.out.println("Account 1: " + account1);

        // Example without an initial balance (assumes zero balance)
        Account account2 = new Account("Jane Smith", 654321);
        System.out.println("Account 2: " + account2);
    }
}

