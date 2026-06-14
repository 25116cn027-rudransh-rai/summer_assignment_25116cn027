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

        System.out.print("Enter element to find frequency: ");
        int key = sc.nextInt();
        int count = 0;

        for (int x : arr) {
            if (x == key) count++;
        }

        System.out.println(key + " appears " + count + " times.");
        sc.close();
    }
}