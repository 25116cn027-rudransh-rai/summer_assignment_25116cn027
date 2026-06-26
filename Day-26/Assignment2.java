import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println(name + " is eligible to vote.");
        } else {
            int remaining = 18 - age;
            System.out.println(name + " is not eligible to vote. Wait " + remaining + " more years.");
        }
        sc.close();
    }
}