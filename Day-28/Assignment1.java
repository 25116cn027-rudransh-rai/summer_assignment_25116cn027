import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        String[] bookName = new String[n];
        String[] author = new String[n];
        boolean[] available = new boolean[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.print("Enter book name: ");
            bookName[i] = sc.next();
            System.out.print("Enter author: ");
            author[i] = sc.next();
            available[i] = true;
        }

        System.out.println("\n--- Library Records ---");
        for (int i = 0; i < n; i++) {
            System.out.println(bookName[i] + " by " + author[i] + " | Available: " + available[i]);
        }
        sc.close();
    }
}