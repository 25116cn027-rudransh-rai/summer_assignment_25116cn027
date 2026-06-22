import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.trim();

        int count = 0;
        if (sentence.length() > 0) {
            count = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println("Number of words = " + count);
        sc.close();
    }
}