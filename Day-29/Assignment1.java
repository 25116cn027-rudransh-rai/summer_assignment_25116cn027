import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Choose operation: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Cannot divide by zero.");
                        } else {
                            System.out.println("Result = " + (a / b));
                        }
                        break;
                }
            }
        } while (choice != 5);

        sc.close();
    }
}