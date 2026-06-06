import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp > 0) {
            if (temp % 2 == 1) {
                count++;
            }
            temp /= 2;
        }

        System.out.println("Number of set bits in " + num + " = " + count);
        sc.close();
    }
}