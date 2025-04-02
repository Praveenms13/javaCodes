import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int number2 = scanner.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);
        scanner.close();
    }
}
