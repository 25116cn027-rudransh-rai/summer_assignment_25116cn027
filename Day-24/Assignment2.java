import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);
            int count = 1;
            while (i + 1 < str.length() && str.charAt(i + 1) == ch) {
                count++;
                i++;
            }
            result += ch;
            if (count > 1) {
                result += count;
            }
            i++;
        }

        System.out.println("Compressed string = " + result);
        sc.close();
    }
}