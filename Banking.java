
import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float balance = 0.0f;

        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    float deposit = scanner.nextFloat();
                    balance += deposit;
                    System.out.println("Deposit successful. New balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    float withdraw = scanner.nextFloat();
                    if (withdraw > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    }
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}