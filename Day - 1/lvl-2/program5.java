import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.printf("The temperature in Celsius is: %.2f%n", celsiusResult);
        scanner.close();
    }
}
