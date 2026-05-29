import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // work with positive numbers only
        if (num < 0) num = -num;

        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // get last digit
            num /= 10;        // remove last digit
        }

        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}