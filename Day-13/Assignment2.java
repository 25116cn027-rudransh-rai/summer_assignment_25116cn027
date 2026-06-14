import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        double avg = (double) total / n;
        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);
        sc.close();
    }
}