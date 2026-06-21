import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size (n for n x n): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        boolean symmetric = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric) System.out.println("Matrix is Symmetric.");
        else System.out.println("Matrix is not Symmetric.");
        sc.close();
    }
}