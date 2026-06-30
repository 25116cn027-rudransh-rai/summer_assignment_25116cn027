import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSeats = 10;
        boolean[] seats = new boolean[totalSeats];
        int choice;

        do {
            System.out.println("\n1. View Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Available seats: ");
                for (int i = 0; i < totalSeats; i++) {
                    if (!seats[i]) System.out.print((i + 1) + " ");
                }
                System.out.println();
            } else if (choice == 2) {
                System.out.print("Enter seat number to book (1-10): ");
                int seatNo = sc.nextInt();
                if (seatNo < 1 || seatNo > totalSeats) {
                    System.out.println("Invalid seat number.");
                } else if (seats[seatNo - 1]) {
                    System.out.println("Seat already booked.");
                } else {
                    seats[seatNo - 1] = true;
                    System.out.println("Seat " + seatNo + " booked successfully.");
                }
            }
        } while (choice != 3);

        sc.close();
    }
}