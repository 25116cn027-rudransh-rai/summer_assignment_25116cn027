import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) num = -num;

        int product = 1;
        while (num > 0) {
            product *= num % 10;  // multiply last digit
            num /= 10;
        }

        System.out.println("Product of digits = " + product);
        sc.close();
    }
}