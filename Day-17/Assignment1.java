import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr2[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];
        int k = 0;
        for (int x : arr1) merged[k++] = x;
        for (int x : arr2) merged[k++] = x;

        System.out.print("Merged array: ");
        for (int x : merged) System.out.print(x + " ");
        sc.close();
    }
}