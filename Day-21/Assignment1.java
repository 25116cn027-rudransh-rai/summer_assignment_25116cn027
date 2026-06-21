import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            count++;
        }

        System.out.println("Length of string = " + count);
        sc.close();
    }
}