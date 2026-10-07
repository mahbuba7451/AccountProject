import java.util.Scanner;

public class AccountApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Object using Default Constructor
        Account acc = new Account();

        // Taking input using Setter Methods
        System.out.print("Enter Account Number: ");
        acc.setAccountNumber(input.nextInt());
        input.nextLine();

        System.out.print("Enter Account Holder Name: ");
        acc.setAccountHolderName(input.nextLine());

        System.out.print("Enter Balance: ");
        acc.setBalance(input.nextDouble());

        // Displaying information using Getter Methods
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Account Holder Name: " + acc.getAccountHolderName());
        System.out.println("Balance: " + acc.getBalance());

        input.close();
    }
}