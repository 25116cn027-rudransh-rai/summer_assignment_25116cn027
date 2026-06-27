import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] basicSalary = new double[n];
        double[] bonus = new double[n];
        double[] netSalary = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter basic salary: ");
            basicSalary[i] = sc.nextDouble();
            System.out.print("Enter bonus: ");
            bonus[i] = sc.nextDouble();
            netSalary[i] = basicSalary[i] + bonus[i];
        }

        System.out.println("\n--- Salary Records ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + " | Basic: " + basicSalary[i] + " | Bonus: " + bonus[i] + " | Net Salary: " + netSalary[i]);
        }
        sc.close();
    }
}