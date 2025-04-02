import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The quotient of " + number1 + " and " + number2 + " is " + quotient + " and the remainder is " + remainder);
        scanner.close();
    }
}
