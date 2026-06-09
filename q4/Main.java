public class Main {
    static class Account {
        String accountNumber;
        double balance;

        Account(String accountNumber, double balance) {
            if (accountNumber == null || accountNumber.isEmpty()) {
                System.out.println("Error: Invalid account number.");
                return;
            }

            if (balance < 0) {
                System.out.println("Error: Balance cannot be negative.");
                return;
            }

            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void display() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Account a1 = new Account("ACC101", 5000);
        a1.display();

        Account a2 = new Account("", 1000);

        Account a3 = new Account("ACC102", -500);
    }
}