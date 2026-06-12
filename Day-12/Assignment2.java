import java.util.Scanner;

public class Assignment2 {

    static boolean checkArmstrong(int n) {
        int temp = n;
        int digits = String.valueOf(n).length();
        int total = 0;
        while (temp > 0) {
            int d = temp % 10;
            total += (int) Math.pow(d, digits);
            temp /= 10;
        }
        return total == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (checkArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        sc.close();
    }
}