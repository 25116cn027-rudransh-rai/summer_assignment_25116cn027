import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        if (n == 1) {
            System.out.println("The " + n + "th Fibonacci term = 0");
        } else {
            System.out.println("The " + n + "th Fibonacci term = " + b);
        }
        sc.close();
    }
}