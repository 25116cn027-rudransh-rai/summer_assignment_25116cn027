import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean isRotation = false;
        if (s1.length() == s2.length()) {
            String combined = s1 + s1;
            if (combined.contains(s2)) {
                isRotation = true;
            }
        }

        if (isRotation) {
            System.out.println(s2 + " is a rotation of " + s1);
        } else {
            System.out.println(s2 + " is not a rotation of " + s1);
        }
        sc.close();
    }
}