import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos++] = arr[i];
            }
        }

        while (pos < n) {
            arr[pos++] = 0;
        }

        System.out.print("After moving zeroes: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}