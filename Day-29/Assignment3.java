import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Reverse String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter a string: ");
                String str = sc.nextLine();

                if (choice == 1) {
                    String rev = new StringBuilder(str).reverse().toString();
                    System.out.println("Reversed = " + rev);
                } else if (choice == 2) {
                    System.out.println("Length = " + str.length());
                } else if (choice == 3) {
                    System.out.println("Uppercase = " + str.toUpperCase());
                } else if (choice == 4) {
                    String rev = new StringBuilder(str).reverse().toString();
                    if (str.equalsIgnoreCase(rev)) {
                        System.out.println("It's a Palindrome.");
                    } else {
                        System.out.println("Not a Palindrome.");
                    }
                }
            }
        } while (choice != 5);

        sc.close();
    }
}