import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] roll = new int[n];
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter roll number: ");
            roll[i] = sc.nextInt();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + " | Roll: " + roll[i] + " | Marks: " + marks[i]);
        }
        sc.close();
    }
}