
import static java.lang.System.out;
import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter the number: ");
            int number = scanner.nextInt();
            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            int index = 0;
            while (number != 0 || index < maxDigit) {
                digits[index] = number % 10;
                number /= 10;
                index++;
            }
            for (int i = 0; i < index; i++) {
                // out.println("Checking Digits[i]: " + digits[i] + " > " + secondLargest + " and < " + firstLargest);
                if (digits[i] > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] < firstLargest) {
                    secondLargest = digits[i];
                }
            }
            out.println("First Largest: " + firstLargest);
            out.println("Second Largest: " + secondLargest);
            scanner.close();
        } catch (Exception e) {
            out.println("Error occurred" + e);
        }
    }
}
