import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        System.out.println("Even count = " + even);
        System.out.println("Odd count = " + odd);
        sc.close();
    }
}