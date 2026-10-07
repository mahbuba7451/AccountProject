public class Account {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Default Constructor
    public Account() {
        accountNumber = 0;
        accountHolderName = "";
        balance = 0.0;
    }

    // Parameterized Constructor
    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Setter Methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter Methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful.");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount.");
        }
    }
}
