import java.util.Scanner;

public class Assignment4 {

    static double calculateAverage(int[] marks) {
        int total = 0;
        for (int m : marks) total += m;
        return (double) total / marks.length;
    }

    static String getGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--- Final Report ---");
        for (int i = 0; i < n; i++) {
            double avg = calculateAverage(marks[i]);
            String grade = getGrade(avg);
            System.out.println(names[i] + " | Average: " + avg + " | Grade: " + grade);
        }
        sc.close();
    }
}