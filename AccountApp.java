import java.util.Scanner;

public class AccountApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account acc = new Account();

        // Account Information
        System.out.print("Enter Account Number: ");
        acc.setAccountNumber(input.nextInt());
        input.nextLine();

        System.out.print("Enter Account Holder Name: ");
        acc.setAccountHolderName(input.nextLine());

        System.out.print("Enter Initial Balance: ");
        acc.setBalance(input.nextDouble());

        // Display Account Information
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Holder Name: " + acc.getAccountHolderName());
        System.out.println("Current Balance: " + acc.getBalance());

        // Transaction Menu
        System.out.println("\nWhat do you want to do?");
        System.out.println("Press 1 for Withdraw");
        System.out.println("Press 2 for Deposit");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        if (choice == 1) {

            System.out.print("Enter Withdraw Amount: ");
            double amount = input.nextDouble();

            acc.withdraw(amount);

            System.out.println("Current Balance: " + acc.getBalance());

        } else if (choice == 2) {

            System.out.print("Enter Deposit Amount: ");
            double amount = input.nextDouble();

            acc.deposit(amount);

            System.out.println("Current Balance: " + acc.getBalance());

        } else {

            System.out.println("Invalid Choice!");
        }

        input.close();
    }
}
