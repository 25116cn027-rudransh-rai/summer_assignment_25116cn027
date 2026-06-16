import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int total = (n + 1) * (n + 2) / 2;
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }

        System.out.println("Missing number = " + (total - sum));
        sc.close();
    }
}