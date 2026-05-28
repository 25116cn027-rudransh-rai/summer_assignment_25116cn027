import java.util.Scanner;

public class SumOfNaturals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + total);
        sc.close();
    }
}