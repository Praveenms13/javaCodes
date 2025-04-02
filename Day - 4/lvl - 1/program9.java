import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter number 1: ");
            int number1 = scanner.nextInt();
            out.print("Enter number 2: ");
            int number2 = scanner.nextInt();
            int[] result = findRemainderAndQuotient(number1, number2);
            out.println("Quotient: " + result[0]);
            out.println("Remainder: " + result[1]);
		} catch (Exception e) {
			out.println("Error occurred" + e);
		}
		scanner.close();
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient, remainder;
        quotient = number / divisor;
        remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}