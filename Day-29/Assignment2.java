import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\n1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Max");
            System.out.println("4. Find Min");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                for (int x : arr) System.out.print(x + " ");
                System.out.println();
            } else if (choice == 2) {
                int sum = 0;
                for (int x : arr) sum += x;
                System.out.println("Sum = " + sum);
            } else if (choice == 3) {
                int max = arr[0];
                for (int x : arr) if (x > max) max = x;
                System.out.println("Max = " + max);
            } else if (choice == 4) {
                int min = arr[0];
                for (int x : arr) if (x < min) min = x;
                System.out.println("Min = " + min);
            }
        } while (choice != 5);

        sc.close();
    }
}