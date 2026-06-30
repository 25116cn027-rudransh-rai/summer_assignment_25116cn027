import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxBooks = 5;
        String[] books = new String[maxBooks];
        int bookCount = 0;
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Remove Book");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (bookCount < maxBooks) {
                    System.out.print("Enter book name: ");
                    books[bookCount] = sc.next();
                    bookCount++;
                    System.out.println("Book added.");
                } else {
                    System.out.println("Library is full.");
                }
            } else if (choice == 2) {
                System.out.println("Books in Library:");
                for (int i = 0; i < bookCount; i++) {
                    System.out.println((i + 1) + ". " + books[i]);
                }
            } else if (choice == 3) {
                System.out.print("Enter book name to remove: ");
                String name = sc.next();
                boolean found = false;
                for (int i = 0; i < bookCount; i++) {
                    if (books[i].equals(name)) {
                        for (int j = i; j < bookCount - 1; j++) {
                            books[j] = books[j + 1];
                        }
                        bookCount--;
                        found = true;
                        System.out.println("Book removed.");
                        break;
                    }
                }
                if (!found) System.out.println("Book not found.");
            }
        } while (choice != 4);

        sc.close();
    }
}