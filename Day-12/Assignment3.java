import java.util.Scanner;

public class Assignment3 {

    static void printFibonacci(int terms) {
        int a = 0, b = 1;
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many terms: ");
        int terms = sc.nextInt();
        System.out.print("Fibonacci: ");
        printFibonacci(terms);
        sc.close();
    }
}