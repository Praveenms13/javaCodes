import static java.lang.System.out;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		try {		
            out.print("Enter total number of chocolates: ");
            int number1 = scanner.nextInt();
            out.print("Enter total number of children: ");
            int number2 = scanner.nextInt();
            int[] result = findRemainderAndQuotient(number1, number2);
            out.println("Number of chocolates each children get: " + result[0]);
            out.println("Remaining Chocolates: " + result[1]);
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