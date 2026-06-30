import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxEmp = 5;
        String[] names = new String[maxEmp];
        double[] salaries = new double[maxEmp];
        int empCount = 0;
        int choice;

        do {
            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Total Salary");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            choice = sc.nextInt();

            if (choice == 1) {
                if (empCount < maxEmp) {
                    System.out.print("Enter employee name: ");
                    names[empCount] = sc.next();
                    System.out.print("Enter salary: ");
                    salaries[empCount] = sc.nextDouble();
                    empCount++;
                    System.out.println("Employee added.");
                } else {
                    System.out.println("Employee list is full.");
                }
            } else if (choice == 2) {
                for (int i = 0; i < empCount; i++) {
                    System.out.println(names[i] + " | Salary: " + salaries[i]);
                }
            } else if (choice == 3) {
                double total = 0;
                for (int i = 0; i < empCount; i++) {
                    total += salaries[i];
                }
                System.out.println("Total Salary = " + total);
            }
        } while (choice != 4);

        sc.close();
    }
}