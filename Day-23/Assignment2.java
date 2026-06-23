import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        char result = '-';
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = str.charAt(i);
                    break;
                }
            }
            if (result != '-') break;
        }

        if (result != '-') {
            System.out.println("First repeating character = " + result);
        } else {
            System.out.println("No repeating character found.");
        }
        sc.close();
    }
}