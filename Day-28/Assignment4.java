import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        String[] phones = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nContact " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter phone number: ");
            phones[i] = sc.next();
        }

        System.out.println("\n--- Contact List ---");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + phones[i]);
        }
        sc.close();
    }
}