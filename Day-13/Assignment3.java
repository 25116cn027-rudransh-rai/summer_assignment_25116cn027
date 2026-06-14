import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int large = arr[0];
        int small = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > large) large = arr[i];
            if (arr[i] < small) small = arr[i];
        }

        System.out.println("Largest = " + large);
        System.out.println("Smallest = " + small);
        sc.close();
    }
}