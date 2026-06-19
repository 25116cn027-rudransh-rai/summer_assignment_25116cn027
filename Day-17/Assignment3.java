import java.util.Scanner;

public class Assignment3 {
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

        System.out.print("Intersection: ");
        for (int x : arr1) {
            for (int y : arr2) {
                if (x == y) {
                    System.out.print(x + " ");
                    break;
                }
            }
        }
        sc.close();
    }
}