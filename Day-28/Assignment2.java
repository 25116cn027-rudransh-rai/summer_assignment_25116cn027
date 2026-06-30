import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Balance = " + balance);
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amt = sc.nextDouble();
                balance += amt;
                System.out.println("New balance = " + balance);
            } else if (choice == 3) {
                System.out.print("Enter withdrawal amount: ");
                double amt = sc.nextDouble();
                if (amt > balance) {
                    System.out.println("Insufficient funds.");
                } else {
                    balance -= amt;
                    System.out.println("New balance = " + balance);
                }
            }
        } while (choice != 4);

        sc.close();
    }
}