
import static java.lang.System.out;
import java.math.BigInteger;
import java.util.Scanner;

public class program4 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            out.print("Enter the number: ");
            BigInteger number = scanner.nextBigInteger();
            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            int index = 0;
            while (number.compareTo(BigInteger.ZERO) != 0) {
                if (index == maxDigit) {
                    maxDigit += 10;
                    int[] digits2 = new int[maxDigit];
                    System.arraycopy(digits, 0, digits2, 0, digits.length);
                    digits = digits2;
                }
                digits[index] = number.mod(BigInteger.TEN).intValue();
                number = number.divide(BigInteger.TEN);
                index++;
            }
            for (int i = 0; i < index; i++) {
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
