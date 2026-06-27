import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] empId = new int[n];
        String[] department = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.print("Enter employee ID: ");
            empId[i] = sc.nextInt();
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter department: ");
            department[i] = sc.next();
        }

        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < n; i++) {
            System.out.println("ID: " + empId[i] + " | Name: " + names[i] + " | Department: " + department[i]);
        }
        sc.close();
    }
}