import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            int freq = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    freq++;
                }
            }
            if (freq > 0) {
                System.out.println(c + " = " + freq);
            }
        }
        sc.close();
    }
}