import java.util.*;

class BankAccount {
	double balance;

    	BankAccount() {
        	balance = 200000;
    	}

    	void deposit(double amount) {
        	if (amount > 0) {
            		balance += amount;
            		System.out.println("Deposited: ₹" + amount);
            		System.out.println("Current Balance: ₹" + balance);
        	}else{
            		System.out.println("Invalid amount!");
        	}
    	}

    	void withdraw(double amount) {
        	if (amount > balance) {
            		System.out.println("Insufficient balance!");
        	}else if (amount <= 0) {
            		System.out.println("Invalid amount!");
        	}else{
            		balance -= amount;
            		System.out.println("Withdrawl: ₹" + amount);
            		System.out.println("Current Balance: ₹" + balance);
        	}
    	}
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	BankAccount BA = new BankAccount();

        	int ch;

        	do{
			System.out.println("\nMENU");
            		System.out.println("1. Display Balance");
            		System.out.println("2. Deposit");
            		System.out.println("3. Withdraw");
            		System.out.println("4. Exit");
            		System.out.print("Enter choice: ");
            		ch = sc.nextInt();

            		switch (ch) {
                		case 1:
                    			System.out.println("Current Balance: ₹" + BA.balance);
                   			break;

                		case 2:
                    			System.out.print("Enter amount to deposit: ₹");
                    			double dep = sc.nextDouble();
                    			BA.deposit(dep);
                    			break;

                		case 3:
                    			System.out.print("Enter amount to withdraw: ₹");
                    			double wit = sc.nextDouble();
                    			BA.withdraw(wit);
                    			break;

                		case 4:
                    			System.out.println("Exit");
                    			break;

                		default:
                    			System.out.println("Invalid choice!");
            		}
        	}while(ch != 4);
    	}
}
