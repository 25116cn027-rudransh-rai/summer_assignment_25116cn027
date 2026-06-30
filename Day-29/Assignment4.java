import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        String[] itemName = new String[n];
        int[] quantity = new int[n];
        double[] price = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));
            System.out.print("Enter item name: ");
            itemName[i] = sc.next();
            System.out.print("Enter quantity: ");
            quantity[i] = sc.nextInt();
            System.out.print("Enter price: ");
            price[i] = sc.nextDouble();
        }

        System.out.println("\n--- Inventory ---");
        double totalValue = 0;
        for (int i = 0; i < n; i++) {
            double value = quantity[i] * price[i];
            totalValue += value;
            System.out.println(itemName[i] + " | Qty: " + quantity[i] + " | Price: " + price[i] + " | Value: " + value);
        }
        System.out.println("Total Inventory Value = " + totalValue);
        sc.close();
    }
}