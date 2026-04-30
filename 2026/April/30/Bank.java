class Bank {

    static String bankName;

    static {
        bankName = "State Bank of India";
        System.out.println("Bank System Initialized");
    }

    static void showBank() {
        System.out.println("Bank Name: " + bankName);
    }
}

class Account {

    String accHolder;
    double balance;

    {
        System.out.println("Account Object Created");
    }

    Account(String name, double bal) {
        accHolder = name;
        balance = bal;
        System.out.println("Account Created for: " + accHolder);
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void showDetails() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + Bank.bankName);
    }
}
class BankSystem {
    public static void main(String[] args) {

        Bank.showBank();

        System.out.println("-------------------");

        Account a1 = new Account("Kishor", 50000);

        a1.deposit(10000);
        a1.withdraw(20000);
        a1.showDetails();

        System.out.println("-------------------");

        Account a2 = new Account("Amit", 30000);
        a2.showDetails();
    }
}