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

        int maxFreq = 0;
        int result = arr[0];

        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) freq++;
            }
            if (freq > maxFreq) {
                maxFreq = freq;
                result = arr[i];
            }
        }

        System.out.println("Most frequent element = " + result);
        System.out.println("Frequency = " + maxFreq);
        sc.close();
    }
}