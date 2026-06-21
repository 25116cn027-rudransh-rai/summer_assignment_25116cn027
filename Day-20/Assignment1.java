import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter c1: ");
        int c1 = sc.nextInt();
        System.out.print("Enter r2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter c2: ");
        int c2 = sc.nextInt();

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int total = 0;
                for (int k = 0; k < c1; k++) {
                    total += a[i][k] * b[k][j];
                }
                result[i][j] = total;
            }
        }

        System.out.println("Resultant matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}