import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int largest = -1;

        while (num % 2 == 0) {
            largest = 2;
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                largest = i;
                num /= i;
            }
        }

        if (num > 2) largest = num;

        System.out.println("Largest prime factor = " + largest);
        sc.close();
    }
}