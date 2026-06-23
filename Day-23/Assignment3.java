import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().toLowerCase().replace(" ", "");
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().toLowerCase().replace(" ", "");

        boolean isAnagram = true;

        if (s1.length() != s2.length()) {
            isAnagram = false;
        } else {
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            java.util.Arrays.sort(arr1);
            java.util.Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Strings are Anagrams.");
        } else {
            System.out.println("Strings are not Anagrams.");
        }
        sc.close();
    }
}