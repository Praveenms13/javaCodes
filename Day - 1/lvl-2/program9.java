import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km%n", rounds);
        scanner.close();
    }
}
