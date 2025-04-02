import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the unit price of an item: ");
        int unit = scanner.nextInt();
        System.out.print("Enter the quantity of the item: ");
        int quantity = scanner.nextInt();
        int total = unit * quantity;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + quantity + " and unit price is INR " + unit);
        scanner.close();
    }
}
