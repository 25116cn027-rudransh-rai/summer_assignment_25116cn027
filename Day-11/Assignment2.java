import java.util.Scanner;

public class Assignment2 {

    static int findMax(int a, int b) {
        if (a > b) return a;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Maximum of " + a + " and " + b + " = " + findMax(a, b));
        sc.close();
    }
}