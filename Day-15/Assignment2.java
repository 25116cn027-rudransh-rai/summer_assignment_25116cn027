import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("How many positions to rotate left: ");
        int k = sc.nextInt();
        k = k % n;

        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        System.out.print("After left rotation: ");
        for (int x : rotated) {
            System.out.print(x + " ");
        }
        sc.close();
    }
}