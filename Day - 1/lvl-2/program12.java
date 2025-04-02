import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weights: ");
        double weight = scanner.nextDouble();
        double weightToPounds = weight * 2.20462;
        System.out.println("Your weight in pounds is " + weightToPounds);
        scanner.close();
    }
}