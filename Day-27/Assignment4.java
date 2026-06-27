import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.next();
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        String[] subjects = new String[n];
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + " name: ");
            subjects[i] = sc.next();
            System.out.print("Enter marks (out of 100): ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = (double) total / n;
        String grade;

        if (percentage >= 90) grade = "A+";
        else if (percentage >= 75) grade = "A";
        else if (percentage >= 60) grade = "B";
        else if (percentage >= 40) grade = "C";
        else grade = "Fail";

        System.out.println("\n--- Marksheet ---");
        System.out.println("Name: " + name);
        for (int i = 0; i < n; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}