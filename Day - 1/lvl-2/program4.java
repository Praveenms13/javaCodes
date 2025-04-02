import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;
        System.out.println("The temperature in fahrenheit is " + fahrenheitResult);
        scanner.close();
    }
}
