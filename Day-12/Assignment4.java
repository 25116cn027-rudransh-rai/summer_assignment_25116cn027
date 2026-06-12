import java.util.Scanner;

public class Assignment4 {

    static boolean checkPerfect(int n) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) total += i;
        }
        return total == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (checkPerfect(n)) {
            System.out.println(n + " is a Perfect number.");
        } else {
            System.out.println(n + " is not a Perfect number.");
        }
        sc.close();
    }
}